package com.example.InjectionSample.example.impl;

import com.example.InjectionSample.example.Example;
import com.example.InjectionSample.service.SomeService;

public class ConstructorInjectionOmitExample implements Example {

	private final SomeService someService;

	public ConstructorInjectionOmitExample(SomeService someService) {
		this.someService = someService;
	}

	public void run() {
		someService.doService();
	}
}
