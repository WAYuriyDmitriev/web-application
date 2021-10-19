package com.example.webapplication.repository;

import com.example.webapplication.model.PositionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionHistoryRepository extends JpaRepository<PositionHistory, Integer> {
}
