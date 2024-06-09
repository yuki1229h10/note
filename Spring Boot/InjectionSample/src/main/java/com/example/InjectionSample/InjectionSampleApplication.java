package com.example.InjectionSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.InjectionSample.example.Example;

@SpringBootApplication
public class InjectionSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionSampleApplication.class, args).getBean(InjectionSampleApplication.class).exe();
	}

	@Autowired
	private Example example;

	private void exe() {
		example.run();
	}

}
