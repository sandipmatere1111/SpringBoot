package com.example.demo3.dao;

import com.example.demo3.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User ,Integer> {

}
