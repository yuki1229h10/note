package com.example.InjectionSample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.InjectionSample.example.Example;
import com.example.InjectionSample.service.SomeService;

public class SetterInjectionExample implements Example {

	private SomeService someService;

	@Autowired
	public void setSomeService(SomeService someService) {
		this.someService = someService;
	}

	public void run() {
		someService.doService();
	}
}
