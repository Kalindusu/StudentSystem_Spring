package com.example.springstudentsystem.repository;

import com.example.springstudentsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
}
