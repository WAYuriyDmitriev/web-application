package com.example.webapplication.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private Integer id;
    private String name;
    private String direction;
}
