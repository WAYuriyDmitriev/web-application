package com.example.webapplication.services;

import com.example.webapplication.model.Employee;
import com.example.webapplication.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends EntityCrud<Employee, EmployeeRepository> {

    EmployeeService(EmployeeRepository employeeRepository) {
        super(employeeRepository);
    }
}
