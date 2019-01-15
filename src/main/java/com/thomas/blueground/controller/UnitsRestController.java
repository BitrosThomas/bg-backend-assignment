package com.thomas.blueground.controller;

import com.thomas.blueground.model.UnitModel;
import com.thomas.blueground.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnitsRestController {

    @Autowired
    private UnitService unitService;

    @GetMapping(path = "/api/units")
    public ResponseEntity<List<UnitModel>> fetchUnits() {
        return ResponseEntity.ok(unitService.findAll());
    }

    @GetMapping(path = "/api/units/{title}")
    public List<UnitModel> findByTitle(@PathVariable String title) {
        return unitService.findByTitle(title);
    }

    @GetMapping(path = "/api/units/{region}")
    public List<UnitModel> findByRegion(@PathVariable String region) {
        return unitService.findByRegion(region);
    }
}
