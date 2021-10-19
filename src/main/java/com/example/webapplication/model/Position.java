package com.example.webapplication.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "position_t", schema = "employee_schema")
public class Position {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "position_seq")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "BASE_SALARY")
    private Double baseSalary;

    @Column(name = "ALLOWANCE")
    private Double Allowance;

    @Column(name = "REWARD")
    private Double REWARD;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_DEPARTMENT", nullable = false)
    private Department departmentItem;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "positionItem")
    private List<Employee> employees;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "positionItem")
    private List<PositionHistory> positionHistories;
}
