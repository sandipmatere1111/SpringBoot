package com.example.demo6.empService;

import com.example.demo6.entity.Employee;

import java.util.List;

public interface EmpService {
    public void insertorupdate(int id, String name,String address);
    public void delete(int id);

    public List<Employee> getemployees();
}
