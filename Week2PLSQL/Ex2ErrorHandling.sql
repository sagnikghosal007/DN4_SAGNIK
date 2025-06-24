--Scenario 1: SafeTransferFunds
CREATE OR REPLACE PROCEDURE SafeTransferFunds(
    p_from_account_id IN NUMBER,
    p_to_account_id IN NUMBER,
    p_amount IN NUMBER
) AS
    v_from_balance NUMBER;
BEGIN
    -- Check balance
    SELECT balance INTO v_from_balance FROM Accounts WHERE account_id = p_from_account_id;

    IF v_from_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    END IF;

    UPDATE Accounts SET balance = balance - p_amount WHERE account_id = p_from_account_id;

    UPDATE Accounts SET balance = balance + p_amount WHERE account_id = p_to_account_id;

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLogs(error_message, log_time) 
        VALUES(SQLERRM, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;


--Scenario 2: UpdateSalary
CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_emp_id IN NUMBER,
    p_percentage IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * p_percentage / 100)
    WHERE emp_id = p_emp_id;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID not found');
    END IF;

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLogs(error_message, log_time) 
        VALUES(SQLERRM, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;


--Scenario 3 : AddNewCustomer
CREATE OR REPLACE PROCEDURE AddNewCustomer(
    p_cust_id IN NUMBER,
    p_name IN VARCHAR2,
    p_balance IN NUMBER
) AS
BEGIN
    INSERT INTO Customers(customer_id, name, balance)
    VALUES(p_cust_id, p_name, p_balance);

    COMMIT;
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        INSERT INTO ErrorLogs(error_message, log_time) 
        VALUES('Duplicate Customer ID: ' || p_cust_id, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Duplicate entry. Customer already exists.');
    WHEN OTHERS THEN
        ROLLBACK;
        INSERT INTO ErrorLogs(error_message, log_time) 
        VALUES(SQLERRM, SYSDATE);
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
