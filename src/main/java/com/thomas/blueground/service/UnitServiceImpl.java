package com.thomas.blueground.service;

import com.thomas.blueground.domain.Unit;
import com.thomas.blueground.exception.UnitNotFoundException;
import com.thomas.blueground.mappers.UnitToUnitModelMapper;
import com.thomas.blueground.model.UnitModel;
import com.thomas.blueground.repository.UnitRepository;
import com.thomas.blueground.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
    The streams that we used to create the lists and sorting.
 */

@Component
public class UnitServiceImpl implements  UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Autowired
    private UnitToUnitModelMapper unitMapper;

    @Override
    public List<UnitModel> findAll() {

        return unitRepository
                .findAll()
                .stream()
                .sorted(Comparator.comparingDouble(Unit::getScore)
                .reversed())
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());

    }

    @Override
    public Unit getUnitAllByUnitID(Long unitID){

        Unit unit = unitRepository.findUnitByUnitID(unitID);
        if(unit!=null){
            return unit;
        }else {
            throw new UnitNotFoundException("Unit with unitID: " + unitID + " not found");
        }
    }

    @Override
    public List<UnitModel> findByTitle(String title) {


        return unitRepository
                .findByTitleContaining(title)
                .stream()
                .sorted(Comparator.comparingDouble(Unit::getScore)
                .reversed())
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());

    }

    @Override
    public List<UnitModel> findByRegion(String region) {

        return unitRepository
                .findByRegionContaining(region)
                .stream()
                .sorted(Comparator.comparingDouble(Unit::getScore)
                .reversed())
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());
    }

    @Override
    public List<UnitModel> findByTitleAndRegion(String title, String region) {

        return unitRepository
                .findByTitleAndRegion(title,region)
                .stream()
                .sorted(Comparator.comparingDouble(Unit::getScore)
                .reversed())
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());


    }
}
