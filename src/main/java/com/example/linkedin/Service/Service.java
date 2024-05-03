package com.example.linkedin.Service;

import com.example.linkedin.Entity.*;

import java.util.List;
import java.util.Optional;

public interface Service {
    Profile saveProfile(Profile profile);


    List<Profile> getDetails();

    Profile update(Profile profile, Long userid);

    int getuserid(String email, String password);

    void savePost(Post post, Long userid);

    List<Object[]> getPostdetails();



    Optional<Profile> getuserdetails(Long userid);

    List<Comments> getcomments(Long postId);

    void saveComments(Comments comments, Long postId, Long userid);

    void saveLikes(Likes likes, Long postId, Long userid);

    long countlikes(Long postId);

    void postConnection(Connections connections, Long userid);

    long countconnections(Long userid);
}
