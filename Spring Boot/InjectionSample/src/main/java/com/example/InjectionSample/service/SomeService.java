package com.example.InjectionSample.service;

import org.springframework.stereotype.Component;

@Component
public class SomeService {

	public void doService() {
		System.out.println("service");
	}
}
