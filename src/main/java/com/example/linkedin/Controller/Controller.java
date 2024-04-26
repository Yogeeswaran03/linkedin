package com.example.linkedin.Controller;


import com.example.linkedin.Entity.Comments;
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

    @PutMapping("/Profile/{userid}")
    public Profile update(@RequestBody Profile profile,@PathVariable("userid") Long userid){
        return service.update(profile,userid);
    }

    @PostMapping("/Comments")
    public Comments saveComments(@RequestBody Comments comments){
        return service.saveComments(comments);
    }

    @GetMapping("/Comments-details")
    public List<Comments> getComments(){
        return service.getComments();
    }

}
