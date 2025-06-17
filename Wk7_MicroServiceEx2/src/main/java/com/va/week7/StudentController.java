package com.va.week7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public Student getStudentDetails() {
        return new Student(123, "John", "Fury", "6756239806");
    }
}
