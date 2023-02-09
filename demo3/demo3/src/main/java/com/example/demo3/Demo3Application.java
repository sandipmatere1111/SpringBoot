package com.example.demo3;

import com.example.demo3.dao.UserRepo;
import com.example.demo3.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args){
		ApplicationContext context=SpringApplication.run((Demo3Application.class));
		UserRepo userRepo = context.getBean(UserRepo.class);

		User user = new User();
		user.setName("Sandip Matere");
		user.setCity("Delhi");
		user.setStatus("I am Java Developer");

		User user1 = userRepo.save(user);
		System.out.println(user1);

		System.out.println("for testing");
		}
}