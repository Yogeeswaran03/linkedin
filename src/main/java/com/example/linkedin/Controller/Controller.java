package com.example.linkedin.Controller;


import com.example.linkedin.Entity.*;
import com.example.linkedin.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping("/Profile/{userid}")
    public Profile update(@RequestBody Profile profile,@PathVariable("userid") Long userid){
        return service.update(profile,userid);
    }
    @PostMapping("/Profile1/{userid}")
    public Optional<Profile> getProfiledetails(@PathVariable("userid") Long userid){
        return service.getuserdetails(userid);
    }

    @PostMapping("/Post/{userid}")
    public void save(@RequestBody Post post,@PathVariable("userid") Long userid){
        service.savePost(post,userid);
    }

    @GetMapping("/Post-details")
    public List<Object[]> getPost(){
        return service.getPostdetails();
    }

    @PostMapping("/post/{post_id}/Comments/{userid}")
    public void saveComments(@PathVariable("post_id") Long post_id,@PathVariable("userid") Long userid,@RequestBody Comments comments){

        service.saveComments(comments,post_id,userid);
    }

    @PostMapping("/Comments/{post_id}")
    public List<Comments> getcomments(@PathVariable("post_id") Long post_id){
        return service.getcomments(post_id);
    }

    @PostMapping("/post/{post_id}/Likes/{userid}")
    public void saveLikes(@PathVariable("post_id") Long post_id,@PathVariable("userid") Long userid,@RequestBody Likes likes){

        service.saveLikes(likes,post_id,userid);
    }
    @PostMapping("/Likes/{post_id}")
    public long countlikes(@PathVariable("post_id") Long post_id){
        return service.countlikes(post_id);
    }

    @PostMapping("/Connections/{userid}")
    public void getconnections(@RequestBody Connections connections,@PathVariable("userid") Long userid){

        service.postConnection(connections,userid);
    }

    @PostMapping("/Connection/{userid}")
    public long countconnections(@PathVariable("userid") Long userid){
        return service.countconnections(userid);
    }


}
