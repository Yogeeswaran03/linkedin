package com.example.linkedin.Service;

import com.example.linkedin.Entity.Profile;

import java.util.List;

public interface Service {
    Profile saveProfile(Profile profile);


    List<Profile> getDetails();
}