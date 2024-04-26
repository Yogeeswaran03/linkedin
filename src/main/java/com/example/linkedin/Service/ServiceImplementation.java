package com.example.linkedin.Service;

import com.example.linkedin.Entity.Comments;
import com.example.linkedin.Entity.Profile;
import com.example.linkedin.Repository.CRepository;
import com.example.linkedin.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Profile update(Profile profile, Long userid) {
        Profile prodb=repository.findById(userid).get();
        if (Objects.nonNull(profile.getUsername())
                && !"".equalsIgnoreCase(
                profile.getUsername())) {
            prodb.setUsername(
                    profile.getUsername());
        }

        if (Objects.nonNull(
                profile.getEmail())
                && !"".equalsIgnoreCase(
                profile.getEmail())) {
            prodb.setEmail(
                    prodb.getEmail());
        }

        if (Objects.nonNull(profile.getPassword()) && !"".equalsIgnoreCase(profile.getPassword())) {
            prodb.setPassword(
                    profile.getPassword());
        }
        if (Objects.nonNull(profile.getJob()) && !"".equalsIgnoreCase(profile.getJob())) {
            prodb.setJob(
                    profile.getJob());
        }
        if (Objects.nonNull(profile.getBio()) && !"".equalsIgnoreCase(profile.getBio())) {
            prodb.setBio(
                    profile.getBio());
        }
        if (Objects.nonNull(profile.getQualification()) && !"".equalsIgnoreCase(profile.getQualification())) {
            prodb.setQualification(
                    profile.getQualification());
        }
        if (Objects.nonNull(profile.getPhoneno())) {
            prodb.setPhoneno(
                    profile.getPhoneno());
        }
        if (Objects.nonNull(profile.getSkill()) && !"".equalsIgnoreCase(profile.getSkill())) {
            prodb.setSkill(
                    profile.getSkill());
        }

        if (Objects.nonNull(profile.getPhoto()) && !"".equalsIgnoreCase(profile.getPhoto())) {
            prodb.setPhoto(
                    profile.getPhoto());
        }

        return repository.save(prodb);
    }

}
