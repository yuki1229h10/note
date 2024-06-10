package com.example.AOPSample.service;

import org.springframework.stereotype.Service;

@Service
public class TargetService {

	public void sayHello(String name) {
		System.out.println("hello, " + name);
	}

	public void sayGoodbye(String name) {
		System.out.println("Good bye, " + name);
	}
}
