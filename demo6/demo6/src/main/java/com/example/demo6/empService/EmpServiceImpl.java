package com.example.demo6.empService;

import com.example.demo6.dao.EmployeeRepo;
import com.example.demo6.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
//	@Autowired
//	JdbcTemplate jdbc;

        @Autowired
        EmployeeRepo rep;


        Employee emp;
        public void insert(String name,String address) {
            emp = new Employee();
            emp.setName(name);
            emp.setAddress(address);
            rep.save(emp);

        }
        @Override
        public void insertorupdate(int id, String name,String address) {
            emp = new Employee();
            try {
                emp = rep.getById(id);
            }
            catch (Exception e) {

            }

            emp.setName(name);
            emp.setAddress(address);
            rep.save(emp);

        }
        @Override
        public void delete(int id) {
            emp= new Employee();
            emp.setId(id);
            rep.delete(emp);

        }
    @Override
        public List<Employee> getemployees(){

            return rep.getemployeelist();
        }
    }
}
