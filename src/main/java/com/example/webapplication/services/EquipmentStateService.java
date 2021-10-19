package com.example.webapplication.services;

import com.example.webapplication.model.EquipmentState;
import com.example.webapplication.repository.EquipmentStateRepository;
import org.springframework.stereotype.Service;

@Service
public class EquipmentStateService extends EntityCrud<EquipmentState, EquipmentStateRepository> {
    EquipmentStateService(EquipmentStateRepository equipmentStateRepository) {
        super(equipmentStateRepository);
    }
}
