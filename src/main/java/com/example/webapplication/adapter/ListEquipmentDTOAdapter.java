package com.example.webapplication.adapter;

import com.example.webapplication.dto.ListEquipmentDTO;
import com.example.webapplication.model.ListEquipment;

public class ListEquipmentDTOAdapter implements CrudResourceDtoAdapter<ListEquipment, ListEquipmentDTO> {
    @Override
    public ListEquipmentDTO objectToObjectDTO(ListEquipment item) {
        return ListEquipmentDTO.builder()
                .id(item.getId())
                .name(item.getName())
                .dateBuy(item.getDateBuy())
                .cost(item.getCost())
                .build();
    }

    @Override
    public ListEquipment objectDTOtoObject(ListEquipmentDTO item, ListEquipment oldItem) {
        oldItem.setId(item.getId());
        oldItem.setName(item.getName());
        oldItem.setDateBuy(item.getDateBuy());
        oldItem.setCost(item.getCost());

        return oldItem;
    }
}
