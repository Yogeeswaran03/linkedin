package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
    @Query("SELECT c FROM Comments c WHERE c.post.id = :postId")
    List<Comments> findByPostId(Long postId);
}
