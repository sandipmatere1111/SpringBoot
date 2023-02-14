package com.example.demo6.dao;
//package com.example.demo6.dao.EmployeeRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo6.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    @Query(value ="select * from employee e",nativeQuery=true)
    List<Employee> getemployeelist();

}

