package com.example.webapplication.adapter;

import com.example.webapplication.dto.PositionHistoryDTO;
import com.example.webapplication.model.PositionHistory;

public class PositionHistoryAdapter implements CrudResourceDtoAdapter<PositionHistory, PositionHistoryDTO> {
    @Override
    public PositionHistoryDTO objectToObjectDTO(PositionHistory item) {
        return PositionHistoryDTO.builder().id(item.getId())
                .startDate(item.getStartDate())
                .endDate(item.getEndDate())
                .employeeFIO(item.getEmployee().getFio())
                .namePosition(item.getPositionItem().getName())
                .build();
    }

    @Override
    public PositionHistory objectDTOtoObject(PositionHistoryDTO item, PositionHistory oldItem) {
        oldItem.setId(item.getId());
        oldItem.setStartDate(item.getStartDate());
        oldItem.setEndDate(item.getEndDate());

        return oldItem;
    }
}
