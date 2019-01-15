package com.thomas.blueground.repository;

import com.thomas.blueground.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewJPARepository extends JpaRepository<Review, Long> {


}
