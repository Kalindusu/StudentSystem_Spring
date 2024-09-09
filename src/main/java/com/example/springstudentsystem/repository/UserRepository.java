package com.example.springstudentsystem.repository;

import com.example.springstudentsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository <User,Integer> {
    @Query(value = "SELECT * FROM USER WHERE ID =?1")
    User getUserById(String userid);

}
