-- Procedure 3: TransferFunds
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) IS
    v_balance  NUMBER;
    v_trans_id NUMBER;
BEGIN
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account
    FOR UPDATE;

    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in Account ' || p_from_account);
        RETURN;
    END IF;
UPDATE Accounts
    SET Balance = Balance - p_amount, LastModified = SYSDATE
    WHERE AccountID = p_from_account;

    UPDATE Accounts
    SET Balance = Balance + p_amount, LastModified = SYSDATE
    WHERE AccountID = p_to_account;

    SELECT NVL(MAX(TransactionID), 1000) + 1 INTO v_trans_id FROM Transactions;
    INSERT INTO Transactions VALUES (v_trans_id, p_from_account, SYSDATE, p_amount, 'Transfer');
    INSERT INTO Transactions VALUES (v_trans_id + 1, p_to_account, SYSDATE, p_amount, 'Transfer');
    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from_account || ' to Account ' || p_to_account);
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Account not found.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Transfer error: ' || SQLERRM);
END;
/
-- Execute Procedures
BEGIN
    ProcessMonthlyInterest;
    UpdateEmployeeBonus('Information Technology', 10);
    TransferFunds(2, 3, 500);
END;
/
