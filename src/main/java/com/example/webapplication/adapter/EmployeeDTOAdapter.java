package com.example.webapplication.adapter;

import com.example.webapplication.dto.EmployeeDTO;
import com.example.webapplication.model.Employee;

public class EmployeeDTOAdapter implements CrudResourceDtoAdapter<Employee, EmployeeDTO> {
    @Override
    public EmployeeDTO objectToObjectDTO(Employee item) {
        return EmployeeDTO.builder()
                .id(item.getId())
                .dateReceipt(item.getDateReceipt())
                .dateDismissal(item.getDateDismissal())
                .orderDismissal(item.getOrderDismissal())
                .orderEnrollment(item.getOrderEnrollment())
                .fio(item.getFio())
                .birthDay(item.getBirthDay())
                .sex(item.getSex())
                .age(item.getAge())
                .number(item.getNumber())
                .passport(item.getPassport())
                .inn(item.getInn())
                .positionName(item.getPositionItem().getName())
                .build();
    }

    @Override
    public Employee objectDTOtoObject(EmployeeDTO item, Employee oldItem) {
        oldItem.setId(item.getId());
        oldItem.setDateReceipt(item.getDateReceipt());
        oldItem.setDateDismissal(item.getDateDismissal());
        oldItem.setOrderDismissal(item.getOrderDismissal());
        oldItem.setOrderEnrollment(item.getOrderEnrollment());
        oldItem.setFio(item.getFio());
        oldItem.setBirthDay(item.getBirthDay());
        oldItem.setSex(item.getSex());
        oldItem.setAge(item.getAge());
        oldItem.setNumber(item.getNumber());
        oldItem.setPassport(item.getPassport());
        oldItem.setInn(item.getInn());

        return oldItem;
    }
}
