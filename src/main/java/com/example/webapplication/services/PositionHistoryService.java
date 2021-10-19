package com.example.webapplication.services;

import com.example.webapplication.model.PositionHistory;
import com.example.webapplication.repository.PositionHistoryRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionHistoryService extends EntityCrud<PositionHistory, PositionHistoryRepository> {
    PositionHistoryService(PositionHistoryRepository positionHistoryRepository) {
        super(positionHistoryRepository);
    }
}
