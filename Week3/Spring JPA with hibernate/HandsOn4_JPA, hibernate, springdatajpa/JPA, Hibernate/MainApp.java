package com.example.demo;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;

public class MainApp {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Aniket");
        emp.setDepartment("Java");

        EmployeeDAO dao = new EmployeeDAO();
        Integer id = dao.addEmployee(emp);
        System.out.println("Employee saved with ID: " + id);
    }
}