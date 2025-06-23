DECLARE 
    c_id CUSTOMERS.CUSTOMERID%type;
    c_name CUSTOMERS.NAME%type;
    l_loanamount LOANS.LOANAMOUNT%type;
    CURSOR due_loan IS SELECT c.CUSTOMERID,c.NAME,l.LOANAMOUNT FROM CUSTOMERS c JOIN LOANS l ON c.CUSTOMERID=l.CUSTOMERID 
    WHERE l.DUEDATE BETWEEN SYSDATE AND SYSDATE+30;
BEGIN
    OPEN due_loan;
    LOOP
        FETCH due_loan INTO c_id,c_name,l_loanamount;
        EXIT WHEN due_loan%notfound;
        dbms_output.put_line('YOUR LOAN FOR CUSTOMER ID '|| ' ' || 'AND NAME' || ' ' || c_name || ' ' || 'IS DUE' || 'FOR AMOUNT' || ' ' || l_loanamount);
    END LOOP;
    CLOSE due_loan;
END;
/
    