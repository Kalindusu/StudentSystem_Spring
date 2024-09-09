package com.example.springstudentsystem.service;

import com.example.springstudentsystem.entity.Student;
import com.example.springstudentsystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo repo;

    public void saveorupdate(Student students) {
        repo.save(students);
    }

    public Iterable<Student> ListAll() {
        return this.repo.findAll();
    }

    public void deletestudent(String id) {
        repo.deleteById(id);
    }
}
