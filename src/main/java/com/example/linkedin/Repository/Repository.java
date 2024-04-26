package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Profile;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Profile,Long> {
}


