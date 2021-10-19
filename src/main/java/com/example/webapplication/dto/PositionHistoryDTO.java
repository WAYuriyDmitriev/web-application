package com.example.webapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PositionHistoryDTO {
    private Integer id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String employeeFIO;
    private String namePosition;
}
