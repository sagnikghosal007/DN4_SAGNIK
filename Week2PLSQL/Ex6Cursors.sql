-- Scenario 1: Generate Monthly Statements
DECLARE
  CURSOR cur_statements IS
    SELECT c.CustomerID, c.Name, t.Amount, t.TransactionType, t.TransactionDate
    FROM Customers c
    JOIN Accounts a ON c.CustomerID = a.CustomerID
    JOIN Transactions t ON a.AccountID = t.AccountID
    WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE);
BEGIN
  FOR rec IN cur_statements LOOP
    DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.Name || ' | Type: ' || rec.TransactionType || ' | Amount: ' || rec.Amount || ' | Date: ' || rec.TransactionDate);
  END LOOP;
END;
/

-- Scenario 2: Apply Annual Fee
DECLARE
  CURSOR cur_accounts IS
    SELECT AccountID, Balance FROM Accounts;
  v_fee CONSTANT NUMBER := 100;
BEGIN
  FOR rec IN cur_accounts LOOP
    UPDATE Accounts SET Balance = Balance - v_fee WHERE AccountID = rec.AccountID;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Update Loan Interest Rates
DECLARE
  CURSOR cur_loans IS
    SELECT LoanID, InterestRate FROM Loans;
  v_newRate NUMBER;
BEGIN
  FOR rec IN cur_loans LOOP
    IF rec.InterestRate < 5 THEN
      v_newRate := rec.InterestRate + 0.5;
    ELSE
      v_newRate := rec.InterestRate;
    END IF;
    UPDATE Loans SET InterestRate = v_newRate WHERE LoanID = rec.LoanID;
  END LOOP;
  COMMIT;
END;
/

