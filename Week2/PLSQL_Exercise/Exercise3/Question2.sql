CREATE PROCEDURE UpdateEmployeeBonus(dept_name IN VARCHAR ,bonus_percent IN NUMBER) IS
BEGIN 
    UPDATE EMPLOYEES SET SALARY=SALARY+(SALARY *(bonus_percent/100))
    WHERE DEPARTMENT =dept_name;
END;
/

EXEC UpdateEmployeeBonus('IT',10);


SELECT * FROM EMPLOYEES