package com.example.webapplication.resource;

import com.example.webapplication.adapter.ListEquipmentDTOAdapter;
import com.example.webapplication.dto.ListEquipmentDTO;
import com.example.webapplication.model.ListEquipment;
import com.example.webapplication.services.ListEquipmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/list-equipment")
public class ListEquipmentResource extends CrudResource<ListEquipment, ListEquipmentService, ListEquipmentDTO> {
    ListEquipmentResource(ListEquipmentService listEquipmentService) {
        super(listEquipmentService, new ListEquipmentDTOAdapter());
    }
}
