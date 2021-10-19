package com.example.webapplication.resource;

import com.example.webapplication.adapter.PositionDTOAdapter;
import com.example.webapplication.dto.PositionDTO;
import com.example.webapplication.model.Position;
import com.example.webapplication.services.PositionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/position")
public class PositionResource extends CrudResource<Position, PositionService, PositionDTO> {
    PositionResource(PositionService positionService) {
        super(positionService, new PositionDTOAdapter());
    }
}
