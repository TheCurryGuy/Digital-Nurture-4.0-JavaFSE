package com.cognizant.jpa_demo.service;

import com.cognizant.jpa_demo.model.Employee;
import com.cognizant.jpa_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeDataRepository;

    @Transactional
    public Employee createNewEmployee(Employee staffMember) {
        return employeeDataRepository.save(staffMember);
    }
}

