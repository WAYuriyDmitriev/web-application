package com.example.webapplication.adapter;

public interface CrudResourceDtoAdapter<T, R> {
    R objectToObjectDTO(T item);

    T objectDTOtoObject(R item, T oldItem);
}
