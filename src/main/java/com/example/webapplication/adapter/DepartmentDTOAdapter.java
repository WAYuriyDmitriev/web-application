package com.example.webapplication.adapter;

import com.example.webapplication.dto.DepartmentDTO;
import com.example.webapplication.model.Department;

public class DepartmentDTOAdapter implements CrudResourceDtoAdapter<Department, DepartmentDTO> {
    @Override
    public DepartmentDTO objectToObjectDTO(Department item) {
        return DepartmentDTO.builder()
                .id(item.getId())
                .name(item.getName())
                .direction(item.getDirection())
                .build();
    }

    @Override
    public Department objectDTOtoObject(DepartmentDTO item, Department oldItem) {
        oldItem.setId(item.getId());
        oldItem.setName(item.getName());
        oldItem.setDirection(oldItem.getDirection());

        return oldItem;
    }
}
