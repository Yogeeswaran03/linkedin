package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Repository extends JpaRepository<Profile,Long> {


    @Query("SELECT p.userid FROM Profile p WHERE p.email = :email AND p.password = :password")
    int getuserid(@Param("email") String email, @Param("password") String password);

}
