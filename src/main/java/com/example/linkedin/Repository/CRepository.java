package com.example.linkedin.Repository;


import com.example.linkedin.Entity.Comments;
import org.springframework.data.repository.CrudRepository;

public interface CRepository extends CrudRepository<Comments,Long> {
}

