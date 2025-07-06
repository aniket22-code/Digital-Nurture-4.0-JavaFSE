package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final EmployeeService employeeService;

    public CommandLineAppStartupRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) {
        Employee emp = new Employee();
        emp.setName("Aniket");
        emp.setDepartment("Java");
        employeeService.addEmployee(emp);
        System.out.println("Employee saved using Spring Data JPA.");
    }
}