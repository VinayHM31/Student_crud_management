package com.StudentDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class StudentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDemoApplication.class, args);
	}

}
