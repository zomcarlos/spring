package com.carlos.crudspring.controller;

import com.carlos.crudspring.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CoursesController {

    @GetMapping
    public List<Course> list() {
        return null;
    }
}