package com.example.webapplication.repository;

import com.example.webapplication.model.PositionHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PositionHistoryRepository extends JpaRepository<PositionHistory, Integer> {

}
