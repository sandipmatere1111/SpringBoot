package com.example.demo4.service;
import java.lang.String;

import com.example.demo4.entities.MyCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<MyCourse> list;

    public void courseServiceImpl(){
        list = new ArrayList<>();
        list.add(new MyCourse(1,"Marathi",100));
        list.add(new MyCourse(2,"English",99));
    }
    @Override
    public List<MyCourse> getCourse(){
        return list;

    }

}
