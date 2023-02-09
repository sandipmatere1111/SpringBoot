package com.example.demo4.controller;

import com.example.demo4.entities.MyCourse;
import com.example.demo4.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping ("/home")
    public String home(){
        return "this is homepage";
    }

    @GetMapping ("/course")
    public List<MyCourse> getCourse(){
        return this.courseService.getCourse();
    }
}
