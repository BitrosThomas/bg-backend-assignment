package com.thomas.blueground.repository;

import com.thomas.blueground.domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitRepository extends JpaRepository<Unit, Long> {

    /**
     The lists for the searching process. One for searching based on title , one for region
     and the combination of both
     */

    @Override
    List<Unit> findAll();
    List<Unit> findByTitleContaining(String title);
    List<Unit> findByRegionContaining(String region);
    List<Unit> findByTitleAndRegion(String title, String region);
    Unit findUnitByUnitID(Long unitID);

}
