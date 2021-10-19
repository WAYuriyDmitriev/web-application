package com.example.webapplication.resource;

import com.example.webapplication.adapter.EquipmentStateDTOAdapter;
import com.example.webapplication.dto.EquipmentStateDTO;
import com.example.webapplication.model.EquipmentState;
import com.example.webapplication.services.EquipmentStateService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/equipment")
public class EquipmentStateResource extends CrudResource<EquipmentState, EquipmentStateService, EquipmentStateDTO> {
    EquipmentStateResource(EquipmentStateService equipmentStateService) {
        super(equipmentStateService, new EquipmentStateDTOAdapter());
    }
}
