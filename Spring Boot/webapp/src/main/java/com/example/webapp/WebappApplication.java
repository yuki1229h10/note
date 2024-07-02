package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webapp.entity.ToDo;
import com.example.webapp.repository.ToDoMapper;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args).getBean(WebappApplication.class);
	}

	private final ToDoMapper mapper;

	public void exe() {
		System.out.println("=== 全件検索 ===");
		for (ToDo row : mapper.selectAll()) {
			System.out.println(row);
		}
	}

}
