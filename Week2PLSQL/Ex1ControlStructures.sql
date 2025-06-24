-- Scenario 1: Apply 1% discount to loan interest rates for customers above 60
BEGIN
    FOR cust_rec IN (
        SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12 > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = cust_rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied to Loan ID: ' || cust_rec.LoanID);
        END IF;
    END LOOP;
END;
/



-- Scenario 2: Set IsVIP flag to TRUE for customers with balance > $10,000

  ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

BEGIN
    FOR cust_rec IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust_rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer ' || cust_rec.CustomerID || ' promoted to VIP.');
        ELSE
            UPDATE Customers
            SET IsVIP = 'FALSE'
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
END;
/


-- Scenario 3: Send Loan reminders to customers whose loans are due within 30 days
BEGIN
    FOR loan_rec IN (
        SELECT l.LoanID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for ' || loan_rec.Name || ' is due on ' || TO_CHAR(loan_rec.EndDate, 'YYYY-MM-DD'));
    END LOOP;
END;
/

