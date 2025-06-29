--Scenario 1 : Processing the Monthly Interest
--Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
        UPDATE Accounts
        SET Balance = Balance + (acc.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE(' Monthly interest processed for all Savings accounts.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(' Error occurred on processing interest: ' || SQLERRM);
END;
/


--Scenario 2 : Updating the Employee Bonus 

--Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.


CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    dept IN VARCHAR2,
    bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept;

    DBMS_OUTPUT.PUT_LINE('Salaries updated with bonus for department: ' || dept);
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error updating salaries: ' || SQLERRM);
END;
/


--Scenario 3 : Safely Transfering Funds
--Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.

CREATE OR REPLACE PROCEDURE TransferFunds (
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_funds EXCEPTION;
    from_balance NUMBER;
BEGIN
    SELECT Balance INTO from_balance FROM Accounts WHERE AccountID = from_acc FOR UPDATE;

    IF from_balance < amount THEN
        RAISE insufficient_funds;
    END IF;

    -- Deduct from sender
    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = from_acc;

    -- Add to receiver
    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = to_acc;

    -- Optional: Insert into Transactions table
    INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
    VALUES (TRANSACTIONS_SEQ.NEXTVAL, from_acc, SYSDATE, amount, 'Debit');

    INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
    VALUES (TRANSACTIONS_SEQ.NEXTVAL, to_acc, SYSDATE, amount, 'Credit');

    COMMIT;
    DBMS_OUTPUT.PUT_LINE(' Transferred ' || amount || ' from Account ' || from_acc || ' to Account ' || to_acc);

EXCEPTION
    WHEN insufficient_funds THEN
        DBMS_OUTPUT.PUT_LINE(' Transfer failed: Insufficient balance in Account ' || from_acc);
        ROLLBACK;
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE(' One of the accounts does not exist.');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE(' Unexpected error: ' || SQLERRM);
        ROLLBACK;
END;
/

