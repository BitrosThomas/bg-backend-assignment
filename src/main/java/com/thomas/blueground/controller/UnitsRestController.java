package com.thomas.blueground.controller;

import com.thomas.blueground.forms.SearchForm;
import com.thomas.blueground.model.ReviewModel;
import com.thomas.blueground.model.UnitModel;
import com.thomas.blueground.service.ReviewService;
import com.thomas.blueground.service.ReviewServiceImpl;
import com.thomas.blueground.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnitsRestController {


    @Autowired
    private UnitService unitService;

    @GetMapping(path = "/api/units")
    public ResponseEntity<List<UnitModel>> fetchUnits() {
        return ResponseEntity.ok(unitService.findAll());
    }

    @GetMapping(path = "/api/units/title/{title}")
    public List<UnitModel> findByTitle(@PathVariable String title) {
        return unitService.findByTitle(title);
    }

    @GetMapping(path = "/api/units/region/{region}")
    public List<UnitModel> findByRegion(@PathVariable String region) {
        return unitService.findByRegion(region);
    }

    @GetMapping(path = "/api/units/search")
    public ResponseEntity<List<UnitModel>> findByTitleAndRegion(@RequestParam (name = "title", required = false, defaultValue = "") String title,
                                                @RequestParam  (name = "region", required = false, defaultValue = "") String region

                                                , @ModelAttribute SearchForm searchForm) {
        try {
        List<UnitModel> list = unitService.findByTitleAndRegion(title, region);
        return ResponseEntity.ok(list);
        }
        catch (Exception ex){
            return ResponseEntity.notFound().build();

        }


    }
}
