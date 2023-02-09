package com.example.demo5.service;

import com.example.demo5.dao.StudDao;
import com.example.demo5.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudServiceImpl implements StudService {

    @Autowired
    private StudDao studDao;
//    List <Student> ls;
    public StudServiceImpl() {
//        ls = new ArrayList<>();
//        ls.add(new Student(1,"Shubham","Mumbai"));
//        ls.add(new Student(2,"Narayan","Pune"));
//        ls.add(new Student(3,"Krushna","Nagpur"));
    }

    @Override
    public List<Student> getStud() {
        return studDao.findAll();
//        return ls;
    }

    @Override
    public Student getStud(long studId) {
        return studDao.getOne(studId);
//        Student c = null;
//        for(Student student : ls){
//            if (student.getId() == studId){
//                c = student;
//                break;
//            }
//        }
//        return c;
    }

    @Override
    public Student addStud(Student student) {
//        ls.add(student);
        studDao.save(student);
        return student;
    }

    @Override
    public void deleteStud(long parselong) {
//        ls=this.ls.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
        Student entity = studDao.getOne(parselong);
        studDao.delete(entity);
    }
}
