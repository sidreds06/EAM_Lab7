package com.va.week7;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        Student.Address address = new Student.Address("1 Markbrook Lane", "123", "Etobicoke");
        return new Student(id, "John", "Fury", "3456234512", "2000-05-11", address);
    }
}
