package com.example.webapplication.services;

import com.example.webapplication.model.Position;
import com.example.webapplication.repository.PositionRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionService extends EntityCrud<Position, PositionRepository> {
    PositionService(PositionRepository positionRepository){
        super(positionRepository);
    }
}
