package com.example.demo5.dao;

import com.example.demo5.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudDao extends JpaRepository<Student, Long> {

}
