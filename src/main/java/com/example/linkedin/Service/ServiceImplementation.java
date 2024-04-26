package com.example.linkedin.Service;

import com.example.linkedin.Entity.Profile;
import com.example.linkedin.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service{
    @Autowired
    public Repository repository;
    @Override
    public Profile saveProfile(Profile profile) {
        return repository.save(profile);
    }

    @Override
    public List<Profile> getDetails() {
        return (List<Profile>)repository.findAll();
    }


}
