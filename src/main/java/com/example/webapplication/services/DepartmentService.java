package com.example.webapplication.services;

import com.example.webapplication.model.Department;
import com.example.webapplication.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService extends EntityCrud<Department, DepartmentRepository> {
    DepartmentService(DepartmentRepository departmentRepository) {
        super(departmentRepository);
    }
}
