package com.carlos.crudspring.controller;

import com.carlos.crudspring.model.Course;
import com.carlos.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CoursesController {

    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list() {

        return courseRepository.findAll();
    }


    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        // System.out.println(course.getName());
        // return courseRepository.save(course);
        return ResponseEntity.status(HttpStatus.CREATED).body(courseRepository.save(course));
    }

}