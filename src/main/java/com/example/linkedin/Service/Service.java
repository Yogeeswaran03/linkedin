package com.example.linkedin.Service;

import com.example.linkedin.Entity.Post;
import com.example.linkedin.Entity.Profile;

import java.util.List;

public interface Service {
    Profile saveProfile(Profile profile);


    List<Profile> getDetails();


    List<Post> getPosts();

    Post savePost(Post post);

    Profile update(Profile profile, Long userid);

    int getuserid(String email, String password);

}
