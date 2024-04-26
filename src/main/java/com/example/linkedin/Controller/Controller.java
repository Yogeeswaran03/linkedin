package com.example.linkedin.Controller;


import com.example.linkedin.Entity.Profile;
import com.example.linkedin.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public Service service;

    @PostMapping("/Profile")
    public Profile saveProfile(@RequestBody Profile profile){
        return service.saveProfile(profile);
    }

    @GetMapping("/Profile-details")
    public List<Profile> getDetails(){
        return service.getDetails();
    }

    @PutMapping

}