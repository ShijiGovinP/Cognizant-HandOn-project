-- Procedure 1: ProcessMonthlyInterest
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance * 1.01
    WHERE UPPER(AccountType) = 'SAVINGS';

    DBMS_OUTPUT.PUT_LINE('1% interest applied to all savings accounts.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error in interest processing: ' || SQLERRM);
END;
/
