package com.cognizant.jpa_demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(nullable = false)
    private String fullName;

    // Setting up constructors and accessor methods

    public Employee() { 
        // Default constructor for JPA
    }

    public Employee(String fullName) {
        this.fullName = fullName;
    }

    // Getter and setter methods for property access
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

