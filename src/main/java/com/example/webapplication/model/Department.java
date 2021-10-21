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
@Table(name = "department", schema = "employee_schema")
public class Department {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_generator")
    @SequenceGenerator(name = "department_generator", sequenceName = "department_seq", schema = "employee_schema")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DIRECTION")
    private String direction;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "departmentItem")
    private List<Position> positions;
}
