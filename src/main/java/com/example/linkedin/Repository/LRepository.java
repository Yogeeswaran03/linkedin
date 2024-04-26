package com.example.linkedin.Repository;


import com.example.linkedin.Entity.Likes;
import org.springframework.data.repository.CrudRepository;

public interface LRepository extends CrudRepository<Likes,Long> {
}

