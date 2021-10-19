package com.example.webapplication.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "equipment_state", schema = "employee_schema")
public class EquipmentState {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "equipment_state_seq")
    private Integer id;

    @Column(name = "DATE_GET")
    private LocalDate getDate;

    @Column(name = "DATE_RETURN")
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_EMPLOYEE", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_EQUIPMENT", nullable = false)
    private ListEquipment listEquipment;
}
