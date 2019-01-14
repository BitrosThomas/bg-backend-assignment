package com.thomas.blueground.repository;

import com.thomas.blueground.domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UnitRepository extends JpaRepository<Unit, Long> {

    @Override
    List<Unit> findAll();

    List<Unit> findByTitleContaining(String title);


}
