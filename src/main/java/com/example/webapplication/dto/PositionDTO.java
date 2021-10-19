package com.example.webapplication.dto;

import com.example.webapplication.model.Department;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionDTO {
    private Integer id;
    private String name;
    private Double baseSalary;
    private Double allowance;
    private Double reward;
    private String departmentName;
    private String departmentDirection;
}
