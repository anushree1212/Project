package com.women.demo.controller;

// UserController.java

import com.women.demo.Entity.Student;
import com.women.demo.Repositary.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@CrossOrigin
class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public String submitForm(@RequestBody Student student) {
        Student save = studentRepository.save(student);
        return "Data submitted successfully!";
    }
}
