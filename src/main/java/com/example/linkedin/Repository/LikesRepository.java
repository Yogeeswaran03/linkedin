package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesRepository extends JpaRepository<Likes,Long> {
     @Query("SELECT COUNT(l) FROM Likes l WHERE l.post.id = :postId")
    long findlikesbyid(@Param("postId") Long postId);
}
