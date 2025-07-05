package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.util.HibernateUtil;
import org.hibernate.*;

public class EmployeeDAO {
    public Integer addEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer employeeId = null;

        try {
            tx = session.beginTransaction();
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeId;
    }
}