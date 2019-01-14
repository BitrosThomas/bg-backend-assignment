package com.thomas.blueground.mappers;

import com.thomas.blueground.domain.Unit;
import com.thomas.blueground.model.UnitModel;
import org.springframework.stereotype.Component;

@Component
public class UnitToUnitModelMapper {

    public UnitModel mapToUnitModel(Unit unit) {
        UnitModel unitModel = new UnitModel(unit.getImage(), unit.getTitle(),  unit.getRegion(), unit.getDescription(), unit.getCancellation(),unit.getPrice(), unit.getScore() );
        return unitModel;
    }

}
