package com.example.springstudentsystem.repo;

import com.example.springstudentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String> {
}
