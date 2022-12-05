package com.example.testdeploya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class TestDeployAApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestDeployAApplication.class, args);
	}

	@GetMapping("/welcome")
	public String appWelcome() {
		return "welcome to my APY." ;
	}

	@GetMapping("/names")
	public List<String> showNames() {
		return List.of("Sam", "Monica", "Maria");
	}

}
