package com.pashuIt.in;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pashuIt.in.entity.User;
import com.pashuIt.in.repository.UserRepository;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		
		/*
		 * List<User> findAll =repository.findAll(); for(User user:findAll) {
		 * System.out.println(user); }
		 */
		 
		
		
		  User entity = new User();
		  
		  entity.setUserId(102); 
		  entity.setUserName("Ricky");
		  entity.setPhoneNumber(955545L); 
		  entity.setCountry("Austrilia");
		  
		  repository.save(entity); 
		  System.out.println("**** Record Inserted ****");
		 
		 
	}

}
