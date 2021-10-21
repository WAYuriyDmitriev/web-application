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
@Table(name = "position_history", schema = "employee_schema")
public class PositionHistory {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_history_generator")
    @SequenceGenerator(name = "position_history_generator", sequenceName = "position_history_seq", schema = "employee_schema")
    private Integer id;

    @Column(name = "START_DATE")
    private LocalDate startDate;

    @Column(name = "END_DATE")
    private LocalDate endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_EMPLOYEE", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_POSITION", nullable = false)
    private Position positionItem;
}
