package com.example.linkedin.Repository;

import com.example.linkedin.Entity.Connections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Connectionrepository extends JpaRepository<Connections,Long> {
    @Query("SELECT COUNT(c) FROM Connections c WHERE c.user.id = :userId")
    long findCountByUserId(@Param("userId") Long userId);


}
