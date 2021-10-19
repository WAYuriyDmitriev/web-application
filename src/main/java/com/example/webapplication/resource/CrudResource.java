package com.example.webapplication.resource;

import com.example.webapplication.services.EntityService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public abstract class CrudResource<T, E extends EntityService<T>> {

    private final E service;

    CrudResource(E service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public T save(@RequestBody T item) {
        return service.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id) {
        service.deleteById(id.get());
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public T update(@RequestBody T item) {
        return service.update(item);
    }
}