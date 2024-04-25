package com.proj1.q3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

            // Save Employee
            Employee employee1 = new Employee(1, "John", 50000);
            employeeDAO.save(employee1);

            // Get Employee by ID
            Employee employeeById = employeeDAO.getById(1);
            System.out.println("Employee by ID: " + employeeById.getName());

            // Get All Employees
            List<Employee> allEmployees = employeeDAO.getAll();
            System.out.println("All Employees:");
            for (Employee employee : allEmployees) {
                System.out.println(employee.getName());
            }
        }
    }
}
