CREATE PROCEDURE TransferFunds(transfer_amount IN NUMBER,account_id IN NUMBER) IS
curr_balance NUMBER;
BEGIN 
    SELECT BALANCE INTO curr_balance FROM ACCOUNTS  WHERE ACCOUNTID=account_id;
    IF(curr_balance>transfer_amount) THEN 
    dbms_output.put_line('Amount will be transfered');
    ELSE 
    dbms_output.put_line('Amount will not be transfered');
    END IF;
END;
/

EXEC TransferFunds(5000,3);
    

