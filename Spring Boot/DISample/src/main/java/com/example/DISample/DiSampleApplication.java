package com.example.DISample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.DISample.used.Greet;

@SpringBootApplication
public class DiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args).getBean(DiSampleApplication.class).execute();
	}

	@Autowired
	private Greet greet;

	private void execute() {
		String message = greet.greeting();
		System.out.println(message);
	}

}
