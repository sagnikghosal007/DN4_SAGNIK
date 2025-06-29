-- Scenario 1: Calculate the age of customers
CREATE OR REPLACE FUNCTION CalculateAge(p_dob DATE)
RETURN NUMBER IS
  v_age NUMBER;
BEGIN
  v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);
  RETURN v_age;
END;
/

-- Scenario 2: Compute monthly installment
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
  p_loanAmount NUMBER,
  p_interestRate NUMBER,
  p_durationYears NUMBER
) RETURN NUMBER IS
  v_monthlyInstallment NUMBER;
  v_ratePerMonth NUMBER;
  v_totalMonths NUMBER;
BEGIN
  v_ratePerMonth := p_interestRate / (12 * 100);
  v_totalMonths := p_durationYears * 12;
  v_monthlyInstallment := p_loanAmount * v_ratePerMonth / (1 - POWER(1 + v_ratePerMonth, -v_totalMonths));
  RETURN v_monthlyInstallment;
END;
/

-- Scenario 3: Check if account has sufficient balance
CREATE OR REPLACE FUNCTION HasSufficientBalance(p_accountID NUMBER, p_amount NUMBER)
RETURN BOOLEAN IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_accountID;
  RETURN v_balance >= p_amount;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    RETURN FALSE;
END;
/
