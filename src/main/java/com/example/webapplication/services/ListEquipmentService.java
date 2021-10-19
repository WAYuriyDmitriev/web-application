package com.example.webapplication.services;

import com.example.webapplication.model.ListEquipment;
import com.example.webapplication.repository.ListEquipmentRepository;
import org.springframework.stereotype.Service;

@Service
public class ListEquipmentService extends EntityCrud<ListEquipment, ListEquipmentRepository> {
    ListEquipmentService(ListEquipmentRepository listEquipmentRepository) {
        super(listEquipmentRepository);
    }
}
