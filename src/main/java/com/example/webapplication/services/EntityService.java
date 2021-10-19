package com.example.webapplication.services;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EntityService<T> {
    List<T> getAll();

    void deleteById(Integer id);

    T save(@RequestBody T newElement);

    T update(@RequestBody T newElement);

    T findById(Integer id);
}