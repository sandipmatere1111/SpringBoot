package com.example.demo5.service;

import com.example.demo5.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudService {
    public List<Student> getStud();

    public Student getStud(long studId);

    public Student addStud(Student student);

    public void deleteStud(long parselong);
}
