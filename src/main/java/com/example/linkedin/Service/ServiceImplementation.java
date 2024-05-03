package com.example.linkedin.Service;

import com.example.linkedin.Entity.*;
import com.example.linkedin.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceImplementation implements Service{


    @Autowired
    public Repository repository;
    public PostRepository postRepository;
    public CommentsRepository commentsRepository;
    public LikesRepository likesRepository;
    public Connectionrepository connectionrepository;
    @Override
    public Profile saveProfile(Profile profile) {
        return repository.save(profile);
    }

    @Override
    public List<Profile> getDetails() {
        return (List<Profile>)repository.findAll();
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

    @Override
    public int getuserid(String email, String password) {
        return repository.getuserid(email,password);
    }

    public ServiceImplementation(PostRepository postRepository,Repository repository,CommentsRepository commentsRepository,LikesRepository likesRepository,Connectionrepository connectionrepository) {
        this.postRepository = postRepository;
        this.repository=repository;
        this.commentsRepository=commentsRepository;
        this.likesRepository=likesRepository;
        this.connectionrepository=connectionrepository;
    }

    public void savePost(Post post, Long userid) {
        // Ensure postRepository is not null before using it

        Profile user = repository.findById(userid).orElseThrow(() -> new IllegalArgumentException("Profile not found with id: " + userid));
        post.setUser(user);
        postRepository.save(post);

    }

    @Override
    public List<Object[]> getPostdetails() {
        return postRepository.getPostdetails();
    }


    @Override
    public Optional<Profile> getuserdetails(Long userid) {
        return repository.findById(userid);
    }

    @Override
    public List<Comments> getcomments(Long postId) {
        return commentsRepository.findByPostId(postId);
    }

    @Override
    public void saveComments(Comments comments, Long postId, Long userid) {
        Post post = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("Post not found with id: " + postId));
        Profile user = repository.findById(userid).orElseThrow(() -> new IllegalArgumentException("Profile not found with id: " + userid));

        // Set the post and user for the comment
        comments.setPost(post);
        comments.setUser(user);

        // Save the comment


        commentsRepository.save(comments);
    }

    @Override
    public void saveLikes(Likes likes, Long postId, Long userid) {
        Post post1 = postRepository.findById(postId).orElseThrow(() -> new IllegalArgumentException("Post not found with id: " + postId));
        Profile user1 = repository.findById(userid).orElseThrow(() -> new IllegalArgumentException("Profile not found with id: " + userid));

// Create a new Likes object
        likes = new Likes();

// Set the post and user for the Likes object
        likes.setPostId(post1);
        likes.setUserId(user1);

// Now, you can save the Likes object
        likesRepository.save(likes);


        // Save the comment



    }

    @Override
    public long countlikes(Long postId) {
        return likesRepository.findlikesbyid(postId);
    }

    @Override
    public void postConnection(Connections connections, Long userid) {
        // Assuming you have a method to retrieve a Profile object by ID from your database
        Profile userProfile = repository.findById(userid).orElse(null);

        if (userProfile != null) {
            Connections connection = new Connections();
            connection.setUser(userProfile);
            // Set other properties of the Connections object if needed
            connectionrepository.save(connection);
        }
    }

    @Override
    public long countconnections(Long userid) {
        return connectionrepository.findCountByUserId(userid);
    }


}
