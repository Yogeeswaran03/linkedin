package com.example.linkedin.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cmt_id")
    private Long cmtId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private Profile user;

    @Column(name = "comment")
    private String comment;

    // No-arg constructor
    public Comments() {
    }

    public Comments(Post post, Profile user, String comment) {
        this.post = post;
        this.user = user;
        this.comment = comment;
    }

    // Getters and setters
    public Long getCmtId() {
        return cmtId;
    }

    public void setCmtId(Long cmtId) {
        this.cmtId = cmtId;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // toString method
    @Override
    public String toString() {
        return "Comments{" +
                "cmtId=" + cmtId +
                ", post=" + post +
                ", user=" + user +
                ", comment='" + comment + '\'' +
                '}';
    }
}