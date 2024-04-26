package com.example.linkedin.Service;

import com.example.linkedin.Entity.Comments;
import com.example.linkedin.Entity.Likes;
import com.example.linkedin.Entity.Post;
import com.example.linkedin.Entity.Profile;

import java.util.List;

public interface Service {
    Profile saveProfile(Profile profile);

    List<Profile> getDetails();

    Profile update(Profile profile, Long userid);

    Comments saveComments(Comments comments);

    List<Comments> getComments();

    Likes saveLikes(Likes likes);

    List<Likes> getLikes();

    List<Post> getPosts();

    Post savePost(Post post);
}
