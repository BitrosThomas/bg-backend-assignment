package com.thomas.blueground.repository;


import com.thomas.blueground.domain.ApplicationUser;
import com.thomas.blueground.domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
    ApplicationUser findApplicationUserById(Long id);
}