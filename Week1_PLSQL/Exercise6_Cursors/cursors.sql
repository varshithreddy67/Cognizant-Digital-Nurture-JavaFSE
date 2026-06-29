SET SERVEROUTPUT ON;

-- Scenario 1: Generate monthly statements for current month transactions
DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT c.Name, a.AccountID, t.TransactionID, t.TransactionDate,
               t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

BEGIN
    FOR rec IN GenerateMonthlyStatements
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Customer: ' || rec.Name ||
            ', Account ID: ' || rec.AccountID ||
            ', Transaction ID: ' || rec.TransactionID ||
            ', Type: ' || rec.TransactionType ||
            ', Amount: ' || rec.Amount ||
            ', Date: ' || TO_CHAR(rec.TransactionDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/

-- Scenario 2: Apply annual maintenance fee to all accounts
DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_fee NUMBER := 100;
BEGIN
    FOR rec IN ApplyAnnualFee
    LOOP
        UPDATE Accounts
        SET Balance = Balance - v_fee,
            LastModified = SYSDATE
        WHERE AccountID = rec.AccountID;

        DBMS_OUTPUT.PUT_LINE('Annual fee applied to Account ID: ' || rec.AccountID);
    END LOOP;

    COMMIT;
END;
/

-- Scenario 3: Update loan interest rates based on new policy
DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans;

BEGIN
    FOR rec IN UpdateLoanInterestRates
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = rec.LoanID;

        DBMS_OUTPUT.PUT_LINE('Interest rate updated for Loan ID: ' || rec.LoanID);
    END LOOP;

    COMMIT;
END;
/