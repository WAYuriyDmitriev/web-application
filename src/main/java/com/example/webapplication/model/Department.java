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
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "department_seq")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DIRECTION")
    private String direction;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "departmentItem")
    private List<Position> positions;
}
