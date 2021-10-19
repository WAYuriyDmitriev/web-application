package com.example.webapplication.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private Integer id;
    private LocalDate dateReceipt;
    private LocalDate dateDismissal;
    private String orderEnrollment;
    private String orderDismissal;
    private String fio;
    private LocalDate birthDay;
    private String sex;
    private Integer age;
    private String number;
    private String passport;
    private String inn;
    private String positionName;
}
