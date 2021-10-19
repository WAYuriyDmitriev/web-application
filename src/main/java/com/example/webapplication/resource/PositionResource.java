package com.example.webapplication.resource;

import com.example.webapplication.model.Position;
import com.example.webapplication.services.PositionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/position")
public class PositionResource extends CrudResource<Position, PositionService>{
    PositionResource(PositionService positionService){
        super(positionService);
    }
}
