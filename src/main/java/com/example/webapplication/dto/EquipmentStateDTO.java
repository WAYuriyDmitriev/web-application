package com.example.webapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentStateDTO {
    private Integer id;
    private LocalDate getDate;
    private LocalDate returnDate;
    private String employeeFio;
    private String employeeNumber;
    private String equipmentName;
    private Double equipmentCost;
}
