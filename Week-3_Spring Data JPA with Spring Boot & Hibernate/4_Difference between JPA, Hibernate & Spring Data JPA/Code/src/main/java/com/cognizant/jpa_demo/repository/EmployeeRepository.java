package com.cognizant.jpa_demo.repository;

import com.cognizant.jpa_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { 
    // JPA provides basic CRUD operations automatically
}
