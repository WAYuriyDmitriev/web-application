package com.example.webapplication.resource;

import com.example.webapplication.adapter.EmployeeDTOAdapter;
import com.example.webapplication.dto.EmployeeDTO;
import com.example.webapplication.model.Employee;
import com.example.webapplication.services.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeResource extends CrudResource<Employee, EmployeeService, EmployeeDTO> {
    EmployeeResource(EmployeeService employeeService) {
        super(employeeService, new EmployeeDTOAdapter());
    }
}
