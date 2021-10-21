package com.example.webapplication.resource;

import com.example.webapplication.adapter.PositionDTOAdapter;
import com.example.webapplication.dto.PositionDTO;
import com.example.webapplication.model.Position;
import com.example.webapplication.services.DepartmentService;
import com.example.webapplication.services.PositionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/position")
public class PositionResource extends CrudResource<Position, PositionService, PositionDTO> {
    PositionService positionService;
    PositionDTOAdapter positionDTOAdapter;

    PositionResource(PositionService positionService) {
        super(positionService, new PositionDTOAdapter());
        this.positionDTOAdapter = new PositionDTOAdapter();
        this.positionService = positionService;
    }


    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Position update(@RequestBody PositionDTO item) {
        return positionService.update( positionDTOAdapter.objectDTOtoObject(item, new Position()));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Position save(@RequestBody PositionDTO item) {
        return positionService.save(positionDTOAdapter.objectDTOtoObject(item, new Position()));
    }
}
