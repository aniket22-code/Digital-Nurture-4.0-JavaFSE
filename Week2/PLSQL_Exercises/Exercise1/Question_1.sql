BEGIN
    FOR cust IN (SELECT c.CUSTOMERID,c.NAME,c.DOB,l.LOANID,l.INTERESTRATE FROM CUSTOMERS c JOIN LOANS l ON 
    l.CUSTOMERID=c.CUSTOMERID)LOOP 
     DECLARE
        cust_age NUMBER;
        BEGIN 
            cust_age:=FLOOR(MONTHS_BETWEEN(SYSDATE,cust.DOB)/12);
        IF cust_age>60 THEN 
            UPDATE LOANS SET INTERESTRATE=INTERESTRATE*0.99 WHERE  LOANID=cust.LOANID;
            UPDATE CUSTOMERS SET LASTMODIFIED=SYSDATE WHERE CUSTOMERID=cust.CUSTOMERID ;
            dbms_output.put_line('update interest rate is'||cust.INTERESTRATE);
            dbms_output.put_line('record and interest rate updated of customer'|| cust.CUSTOMERID);
        
        END IF;
    END;
    END LOOP;
END;
/

SELECT * FROM LOANS;