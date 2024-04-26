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

    private Long postId;
    private Long userId;
    private String cmt;

    public Comments(Long post, Long user, String comment) {
        this.postId = post;
        this.userId = user;
        this.cmt = comment;
    }

    // Getters and setters
    public Long getCmtId() {
        return cmtId;
    }

    public void setCmtId(Long cmtId) {
        this.cmtId = cmtId;
    }

    public Long getPostID() {
        return post.getPostId();
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getUserId() {
        return user.getUserid();
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public String getCmt() {
        return cmt;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // toString method
    @Override
    public String toString() {
        return "Comments{" +
                "cmtId=" + cmtId +
                ", post=" + postId +
                ", user=" + userId +
                ", comment='" + cmt + '\'' +
                '}';
    }
}