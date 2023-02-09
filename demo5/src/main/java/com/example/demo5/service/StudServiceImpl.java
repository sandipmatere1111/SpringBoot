package com.example.demo5.service;

import com.example.demo5.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudServiceImpl implements StudService {
    List <Student> ls;
    public StudServiceImpl() {
        ls = new ArrayList<>();
        ls.add(new Student(1,"Shubham","Mumbai"));
        ls.add(new Student(2,"Narayan","Pune"));
        ls.add(new Student(3,"Krushna","Nagpur"));
    }

    @Override
    public List<Student> getStud() {
        return ls;
    }

    @Override
    public Student getStud(long studId) {
        Student c = null;
        for(Student student : ls){
            if (student.getId() == studId){
                c = student;
                break;
            }
        }
        return c;
    }

    @Override
    public Student addStud(Student student) {
        ls.add(student);
        return student;
    }
}
