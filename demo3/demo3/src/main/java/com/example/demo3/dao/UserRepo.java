package com.example.demo3.dao;

import com.example.demo3.entities.Citizenn;
//import com.sun.org.apache.bcel.internal.generic.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<Citizenn,Integer> {
    //Query Creation
    public List<Citizenn> findByNameAndCity(String name,String city);

    @Query("select u FROM Citizenn u")
    public List<Citizenn> getAllCitizenn();
}
