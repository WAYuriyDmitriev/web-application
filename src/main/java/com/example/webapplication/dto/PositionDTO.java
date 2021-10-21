package com.example.webapplication.dto;

import lombok.*;

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
    private DepartmentDTO department;
}
