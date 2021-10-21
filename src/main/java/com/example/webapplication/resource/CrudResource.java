package com.example.webapplication.resource;

import com.example.webapplication.adapter.CrudResourceDtoAdapter;
import com.example.webapplication.services.EntityService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoRepositoryBean
public abstract class CrudResource<T, E extends EntityService<T>, R> {

    private final E service;
    private final CrudResourceDtoAdapter<T, R> crudResourceDtoAdapter;

    CrudResource(E service, CrudResourceDtoAdapter<T, R> crudResourceDtoAdapter) {
        this.service = service;
        this.crudResourceDtoAdapter = crudResourceDtoAdapter;
    }

    @GetMapping
    public List<R> getAll() {
        return service.getAll().stream().map(crudResourceDtoAdapter::objectToObjectDTO).collect(Collectors.toList());
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id) {
        service.deleteById(id.get());
    }
}