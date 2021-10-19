package com.example.webapplication.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.ArrayList;
import java.util.List;

@NoRepositoryBean
public abstract class EntityCrud<T, E extends JpaRepository<T, Integer>> implements EntityService<T> {

    private final E repository;

    EntityCrud(E repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public T save(T newElement) {
        return repository.saveAndFlush(newElement);
    }

    @Override
    public T update(T newElement) {
        return repository.saveAndFlush(newElement);
    }
}