package com.example.webapplication.resource;

import com.example.webapplication.adapter.DepartmentDTOAdapter;
import com.example.webapplication.dto.DepartmentDTO;
import com.example.webapplication.model.Department;
import com.example.webapplication.services.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/department")
public class DepartmentResource extends CrudResource<Department, DepartmentService, DepartmentDTO> {
    DepartmentResource(DepartmentService departmentService) {
        super(departmentService, new DepartmentDTOAdapter());
    }
}
