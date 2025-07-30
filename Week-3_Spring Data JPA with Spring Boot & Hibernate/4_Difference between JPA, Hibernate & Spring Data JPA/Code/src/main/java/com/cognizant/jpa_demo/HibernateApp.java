package com.cognizant.jpa_demo;

import com.cognizant.jpa_demo.dao.EmployeeDao;
import com.cognizant.jpa_demo.model.Employee;

public class HibernateApp {
    public static void main(String[] args) {
        EmployeeDao dataAccessObject = new EmployeeDao();
        Integer employeeId = dataAccessObject.createEmployee(new Employee("Alice"));
        System.out.println("Hibernate successfully persisted Employee with ID: " + employeeId);
    }
}
