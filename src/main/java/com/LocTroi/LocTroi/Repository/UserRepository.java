package com.LocTroi.LocTroi.Repository;

import com.LocTroi.LocTroi.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity ,Long> {

    @Query(value = "select * from user u where u.id = ?1", nativeQuery = true)
    UserEntity findById(long id);
}
