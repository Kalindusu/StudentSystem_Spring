package com.example.springstudentsystem.controller;

import com.example.springstudentsystem.entity.Student;
import com.example.springstudentsystem.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class studentController {
    @Autowired
    private StudentServices studentservices;
    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student students){
        studentservices.saveorupdate(students);
        return students.getId();

    }

    @GetMapping(value = "/getAll")
    private Iterable<Student>getStudents(){
        return studentservices.ListAll();

    }
    @PutMapping(value = "/edit/{id}")
    private Student update(@RequestBody Student student,@PathVariable(name="id")String id) {
      student.setId(id);
        studentservices.saveorupdate(student);
        return student;
    }

    @PutMapping(value = "/delete/{id}")
    private void deletestudent(@PathVariable("id")String id) {
       studentservices.deletestudent(id);
    }



}
