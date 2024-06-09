package com.example.JavaConfigApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.JavaConfigApp.service.BusinessLogic;

@SpringBootApplication
public class JavaConfigAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigAppApplication.class, args).getBean(JavaConfigAppApplication.class).exe();
	}

	@Autowired
	@Qualifier("test")
	private BusinessLogic business1;

	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2;

	public void exe() {
		business1.doLigic();
		business2.doLigic();
	}

}
