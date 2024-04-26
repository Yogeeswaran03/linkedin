package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Post;
import com.example.linkedin.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

    public interface PostRepository extends CrudRepository<Post,Long> {
    }

