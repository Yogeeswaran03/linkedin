package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    @Query("SELECT p FROM Post p JOIN p.user pr WHERE p.user.userid = pr.userid")
    List<Object[]> getPostdetails();

}
