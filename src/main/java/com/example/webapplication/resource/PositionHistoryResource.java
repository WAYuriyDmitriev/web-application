package com.example.webapplication.resource;

import com.example.webapplication.model.PositionHistory;
import com.example.webapplication.services.PositionHistoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/position-history")
public class PositionHistoryResource extends CrudResource<PositionHistory, PositionHistoryService> {
    PositionHistoryResource(PositionHistoryService positionHistoryService) {
        super(positionHistoryService);
    }
}
