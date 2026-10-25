package com.caio.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.caio.myapi.entity.User;
import com.caio.myapi.repository.UserRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	private final  UserRepository userRepository;

	MyapiApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//User user01 = new User(null, "Caio Vilarouca", "CaioVRT","javinha1995");
		//User user02 = new User(null, "Bruno Contente", "Descontente","miguel123");
		//User user03 = new User(null, "Antonio Evandro", "Evandro","Sucesso@2026");
		
		//userRepository.saveAll(Arrays.asList(user01, user02, user03));
	}

}
