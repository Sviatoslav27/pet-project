package com.example.petproject.controller;

import com.example.petproject.model.Student;
import com.example.petproject.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor

@RestController
@RequestMapping("/students")
public class StudentController {
    StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
