package com.example.webapplication.adapter;

import com.example.webapplication.dto.DepartmentDTO;
import com.example.webapplication.dto.PositionDTO;
import com.example.webapplication.model.Department;
import com.example.webapplication.model.Position;

public class PositionDTOAdapter implements CrudResourceDtoAdapter<Position, PositionDTO> {
    @Override
    public PositionDTO objectToObjectDTO(Position item) {
        return PositionDTO.builder()
                .id(item.getId())
                .name(item.getName())
                .baseSalary(item.getBaseSalary())
                .allowance(item.getAllowance())
                .reward(item.getReward())
                .department(DepartmentDTO.builder()
                        .id(item.getDepartmentItem().getId())
                        .name(item.getDepartmentItem().getName())
                        .direction(item.getDepartmentItem().getDirection())
                        .build())
                .build();
    }

    @Override
    public Position objectDTOtoObject(PositionDTO item, Position oldItem) {
        oldItem.setId(item.getId());
        oldItem.setName(item.getName());
        oldItem.setBaseSalary(item.getBaseSalary());
        oldItem.setAllowance(item.getAllowance());
        oldItem.setReward(item.getReward());
        Department department = new Department();
        department.setId(item.getDepartment().getId());
        oldItem.setDepartmentItem(department);

        return oldItem;
    }
}
