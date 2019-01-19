package com.thomas.blueground.service;

import com.thomas.blueground.domain.Unit;
import com.thomas.blueground.model.UnitModel;

import java.util.List;
import java.util.Optional;

public interface UnitService {

    List<UnitModel> findAll();
    Unit getUnitAllByUnitID(Long unitID);
    List<UnitModel> findByTitle(String title);
    List<UnitModel> findByRegion(String region);
    List<UnitModel> findByTitleAndRegion(String title, String region);

}
