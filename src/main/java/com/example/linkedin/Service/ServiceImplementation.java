package com.example.linkedin.Service;

import com.example.linkedin.Entity.Comments;
import com.example.linkedin.Entity.Profile;
import com.example.linkedin.Repository.CRepository;
import com.example.linkedin.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service{
    @Autowired
    public Repository repository;
    public CRepository crepository;
    @Override
    public Profile saveProfile(Profile profile) {
        return repository.save(profile);
    }

    @Override
    public List<Profile> getDetails() {
        return (List<Profile>)repository.findAll();
    }

    @Override
    public Comments saveComments(Comments comments) {
        return crepository.save(comments);
    }

    @Override
    public List<Comments> getComments() {
        return (List<Comments>)crepository.findAll();
    }


}
