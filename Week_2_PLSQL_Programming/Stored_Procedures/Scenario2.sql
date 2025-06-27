-- Procedure 2: UpdateEmployeeBonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department     IN VARCHAR2,
    p_bonus_percent  IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + Salary * (p_bonus_percent / 100)
    WHERE UPPER(Department) = UPPER(p_department);

    DBMS_OUTPUT.PUT_LINE(p_bonus_percent || '% bonus applied to ' || p_department || ' department.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END;
/
