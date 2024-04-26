package com.example.linkedin.Controller;



import com.example.linkedin.Entity.LoginRequest;

import com.example.linkedin.Entity.Post;

import com.example.linkedin.Entity.Profile;
import com.example.linkedin.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public Service service;
    public LoginRequest loginRequest;

    @PostMapping("/Profile")
    public Profile saveProfile(@RequestBody Profile profile){
        return service.saveProfile(profile);
    }

    @PostMapping("/Profile-id")
    public int saveProfile(@RequestBody LoginRequest loginRequest) {
        return service.getuserid(loginRequest.getEmail(), loginRequest.getPassword());
    }


    @GetMapping("/Profile-details")
    public List<Profile> getDetails(){
        return service.getDetails();
    }




    @PostMapping("/Post")
    public Post savePost(@RequestBody Post post)
    {
        return service.savePost(post);
    }
    @GetMapping("/Post-details")
    public List<Post> getPosts(){

        return service.getPosts();

    @PutMapping("/Profile/{userid}")
    public Profile update(@RequestBody Profile profile,@PathVariable("userid") Long userid){
        return service.update(profile,userid);

    }

}
