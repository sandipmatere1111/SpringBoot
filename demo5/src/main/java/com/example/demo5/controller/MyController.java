package com.example.demo5.controller;

import com.example.demo5.entity.Student;
import com.example.demo5.service.StudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MyController {
    @Autowired
    private StudService studService;

    @GetMapping("/students")
    public List<Student> getStud(){
        return this.studService.getStud();
    }
    @GetMapping("/student/{studId}")
    public Student getStud(@PathVariable String studId){
        return this.studService.getStud(Long.parseLong(studId));
    }

    @PostMapping("/students")
    public Student addStud(@RequestBody Student student){
        return this.studService.addStud(student);
    }
}
