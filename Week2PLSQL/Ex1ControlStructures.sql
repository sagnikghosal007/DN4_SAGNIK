-- Scenario 1: Apply 1% discount to loan interest rates for customers above 60
BEGIN
  FOR rec IN (SELECT CustomerID, InterestRate FROM Loans JOIN Customers USING (CustomerID) WHERE Age > 60) LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Applied 1% discount for customers above 60.');
END;
/

-- Scenario 2: Set IsVIP flag to TRUE for customers with balance > $10,000
BEGIN
  FOR rec IN (SELECT CustomerID FROM Customers WHERE Balance > 10000) LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = rec.CustomerID;
  END LOOP;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Marked VIP customers with balance over $10,000.');
END;
/

-- Scenario 3: Send reminders to customers whose loans are due within 30 days
DECLARE
  v_due_date Loans.DueDate%TYPE;
  v_customer_name Customers.Name%TYPE;
BEGIN
  FOR rec IN (
    SELECT c.Name, l.DueDate
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || rec.Name || ' - Loan due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/
