package com.example.webapplication.adapter;

import com.example.webapplication.dto.EquipmentStateDTO;
import com.example.webapplication.model.EquipmentState;

public class EquipmentStateDTOAdapter implements CrudResourceDtoAdapter<EquipmentState, EquipmentStateDTO> {
    @Override
    public EquipmentStateDTO objectToObjectDTO(EquipmentState item) {
        return EquipmentStateDTO.builder()
                .id(item.getId())
                .getDate(item.getGetDate())
                .returnDate(item.getReturnDate())
                .employeeFio(item.getEmployee().getFio())
                .employeeNumber(item.getEmployee().getNumber())
                .equipmentName(item.getListEquipment().getName())
                .equipmentCost(item.getListEquipment().getCost())
                .build();
    }

    @Override
    public EquipmentState objectDTOtoObject(EquipmentStateDTO item, EquipmentState oldItem) {
        oldItem.setId(item.getId());
        oldItem.setGetDate(item.getGetDate());
        oldItem.setReturnDate(item.getReturnDate());

        return oldItem;
    }
}
