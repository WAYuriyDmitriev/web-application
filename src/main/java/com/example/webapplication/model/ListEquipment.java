package com.example.webapplication.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "list_equipment", schema = "employee_schema")
public class ListEquipment {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_equipment_generator")
    @SequenceGenerator(name = "list_equipment_generator", sequenceName = "list_equipment_seq", schema = "employee_schema")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE_BUY")
    private LocalDate dateBuy;

    @Column(name = "COST")
    private Double cost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "listEquipment")
    private List<EquipmentState> equipmentStates;
}
