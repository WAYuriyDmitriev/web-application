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
@Table(name = "employee", schema = "employee_schema")
public class Employee {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
    @SequenceGenerator(name = "employee_generator", sequenceName = "employee_seq", schema = "employee_schema")
    private Integer id;

    @Column(name = "DATE_RECEIPT")
    private LocalDate dateReceipt;

    @Column(name = "DATE_DISMISSAL")
    private LocalDate dateDismissal;

    @Column(name = "ORDER_ENROLLMENT")
    private String orderEnrollment;

    @Column(name = "ORDER_DISMISSAL")
    private String orderDismissal;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "BIRTHDAY")
    private LocalDate birthDay;

    @Column(name = "SEX")
    private String sex;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "NUMBER")
    private String number;

    @Column(name = "PASSPORT")
    private String passport;

    @Column(name = "INN")
    private String inn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_ID", nullable = false)
    private Position positionItem;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    private List<PositionHistory> positionHistories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    private List<EquipmentState> equipmentStates;
}
