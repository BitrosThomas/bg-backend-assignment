package com.thomas.blueground.service;

import com.thomas.blueground.domain.ApplicationUser;
import com.thomas.blueground.domain.Unit;
import com.thomas.blueground.exception.UnitNotFoundException;
import com.thomas.blueground.exception.UserNotFoundException;
import com.thomas.blueground.repository.ApplicationUserRepository;
import com.thomas.blueground.repository.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationUserServiceImpl implements ApplicationUserService {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    public ApplicationUser getApplicationUserAllById(Long id){

        ApplicationUser applicationUser = applicationUserRepository.findApplicationUserById(id);
        if(applicationUser!=null){
            return applicationUser;
        }else {
            throw new UserNotFoundException("User with id: " + id + " not found");
        }
    }
}
