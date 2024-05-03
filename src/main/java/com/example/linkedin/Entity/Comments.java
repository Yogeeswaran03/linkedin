package com.example.linkedin.Entity;

import com.example.linkedin.Entity.Post;
import com.example.linkedin.Entity.Profile;
import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cmt_id")
    private Long cmtId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", nullable = false)
    private Profile user;

    @Column(name = "comment")
    private String comment;

    public Comments() {
    }

    public Comments(Post post, Profile user, String comment) {
        this.post = post;
        this.user = user;
        this.comment = comment;
    }

    public Long getCmtId() {
        return cmtId;
    }

    public void setCmtId(Long cmtId) {
        this.cmtId = cmtId;
    }

    public Long getPostId() {
        return post != null ? post.getPostId() : null;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Long getUserId() {
        return user != null ? user.getUserid() : null;
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

    @Override
    public String toString() {
        return "Comments{" +
                "cmtId=" + cmtId +
                ", postId=" + getPostId() +
                ", userId=" + getUserId() +
                ", comment='" + comment + '\'' +
                '}';
    }
}
