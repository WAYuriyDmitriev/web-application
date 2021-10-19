package com.example.webapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListEquipmentDTO {
    private Integer id;
    private String name;
    private LocalDate dateBuy;
    private Double cost;
}
