package com.example.AOPSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.AOPSample.service.TargetService;

@SpringBootApplication
public class AopSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args).getBean(AopSampleApplication.class).exe();
	}

	@Autowired
	private TargetService targetService;

	private void exe() {
		targetService.sayHello("Ken");
		System.out.println("------");
		targetService.sayGoodbye("Ryu");
	}

}
