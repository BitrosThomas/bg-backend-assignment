package com.thomas.blueground.repository;


import com.thomas.blueground.domain.ApplicationUser;
import com.thomas.blueground.domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
/**
    Contains 2 methods: 1 method for finding the username of a user for the authentication process
    and 1 method for checking if a user with the specific id exists to create a review.
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
    ApplicationUser findApplicationUserById(Long id);
}