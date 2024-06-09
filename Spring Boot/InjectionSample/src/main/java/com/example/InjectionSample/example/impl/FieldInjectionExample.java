package com.example.InjectionSample.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.InjectionSample.example.Example;
import com.example.InjectionSample.service.SomeService;

public class FieldInjectionExample implements Example {

	@Autowired
	private SomeService someService;

	@Override
	public void run() {
		someService.doService();
	}
}
