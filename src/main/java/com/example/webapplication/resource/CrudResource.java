package com.example.webapplication.resource;

import com.example.webapplication.adapter.CrudResourceDtoAdapter;
import com.example.webapplication.services.EntityService;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@NoRepositoryBean
public abstract class CrudResource<T, E extends EntityService<T>, R > {

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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public T save(@RequestBody T item) {
        return service.save(item);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Optional<Integer> id) {
        service.deleteById(id.get());
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public T update(@RequestBody R item, @PathVariable Optional<Integer> id) {
        return service.update(crudResourceDtoAdapter.objectDTOtoObject(item, service.findById(id.get())));
    }


}