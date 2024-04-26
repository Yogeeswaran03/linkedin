package com.example.linkedin.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Profile user;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "media")
    private String media;

    @Column(name = "hashtags")
    private String hashtags;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name="post_date")
    private String postDate;

    // No-arg constructor
    public Post() {
    }

    // Getters and setters
    public Long getPostId() {
        return postId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Profile getUser() {
        return user;
    }

    public void setPostDate(String postDate)
    {
        this.postDate=this.postDate;

    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getHashtags() {
        return hashtags;
    }

    public void setHashtags(String hashtags) {
        this.hashtags = hashtags;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    // toString method
    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", user=" + user +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", media='" + media + '\'' +
                ", hashtags='" + hashtags + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}