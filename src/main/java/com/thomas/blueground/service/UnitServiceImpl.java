package com.thomas.blueground.service;

import com.thomas.blueground.mappers.UnitToUnitModelMapper;
import com.thomas.blueground.model.UnitModel;
import com.thomas.blueground.repository.UnitRepository;
import com.thomas.blueground.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

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
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());

    }

    @Override
    public List<UnitModel> findByTitle(String title) {

        return unitRepository
                .findByTitleContaining(title)
                .stream()
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());

    }

    @Override
    public List<UnitModel> findByRegion(String region){

        return unitRepository
                .findByRegionContaining(region)
                .stream()
                .map(unit -> unitMapper.mapToUnitModel(unit))
                .collect(Collectors.toList());
    }
}
