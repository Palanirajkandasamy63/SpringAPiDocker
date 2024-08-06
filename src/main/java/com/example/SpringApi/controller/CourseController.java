package com.example.SpringApi.controller;


import com.example.SpringApi.Repository.CourseRepository;
import com.example.SpringApi.bean.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    //http://localhost:8080/courses

    @Autowired
    private CourseRepository repository;
    @GetMapping("/courses")
    public List<Course> getAllCourse() {
        return repository.findAll();
        // return Arrays.asList(new Course(1, "learn Microservices", "Raj"),new Course(2, "learn Microservices chapt2 ", "Raj"));
    }

    @GetMapping("/courses/{id}")
    public Course getCourse1(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("course is not found with id " + id);
        }
        return course.get();
        //return new Course(1, "learn Microservices", "Raj");
    }
    //post create a new resource
    @PostMapping("/courses")
    public void CreateCourse(@RequestBody Course course) {
        repository.save(course);
    }

    //put update or replace a course
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id ,@RequestBody Course course) {

        repository.save(course);
    }
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id ,@RequestBody Course course) {

        repository.deleteById(id);
    }


}
