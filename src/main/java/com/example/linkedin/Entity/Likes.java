package com.example.linkedin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id")
    private Long likeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", nullable = false)
    private Profile user;

    // No-arg constructor
    public Likes() {
    }

    // Getters and setters
    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public Long getPostId() {
        return post != null ? post.getPostId() : null;
    }

    public void setPostId(Post post) {
        // Assuming you have a method to find a Post entity by its ID and set it
        this.post = post;/* some method to find Post by ID */;
    }

    public Long getUserId() {
        return user != null ? user.getUserid() : null;
    }

    public void setUserId(Profile user) {
        // Assuming you have a method to find a Profile entity by its ID and set it
        this.user = user;/* some method to find Profile by ID */;
    }

    // toString method
    @Override
    public String toString() {
        return "Likes{" +
                "likeId=" + likeId +
                ", postId=" + getPostId() +
                ", userId=" + getUserId() +
                '}';
    }
}
