CREATE PROCEDURE MonthlyInterest IS
BEGIN 
    UPDATE ACCOUNTS SET 
    BALANCE=BALANCE+(BALANCE*0.01)
    WHERE ACCOUNTTYPE='Savings';
END;
/

EXEC MonthlyInterest;

select * from accounts