package com.example.demo3;

import com.example.demo3.dao.UserRepo;
import com.example.demo3.entities.Citizenn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args){
		ApplicationContext context=SpringApplication.run((Demo3Application.class));
		UserRepo userRepo = context.getBean(UserRepo.class);

		Citizenn citizenn = new Citizenn();
		citizenn.setId(2);
		citizenn.setName("Sandip Matere");
		citizenn.setCity("Delhi");
		citizenn.setStatus("I am Java Developer");

		citizenn.setName("Jitu");
		citizenn.setCity("Mumbai");
		citizenn.setStatus("I am UPSC Aspirant");

		Citizenn citizenn1 = userRepo.save(citizenn);
		System.out.println(citizenn1);

		System.out.println("for testing");

		List<Citizenn> citizenns = userRepo.findByNameAndCity("Jitu","Mumbai");
		citizenns.forEach(e-> System.out.println(e));
        List<Citizenn> AllCitizen = userRepo.getAllCitizenn();
         AllCitizen.forEach(e->System.out.println(e));
}}