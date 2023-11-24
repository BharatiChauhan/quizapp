package com.mavndemo.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.RestController;
@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"com.mavendemo.quizapp", "Controller"})
@ComponentScan
@RestController


public class QuizappApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuizappApplication.class, args);
	}

}
