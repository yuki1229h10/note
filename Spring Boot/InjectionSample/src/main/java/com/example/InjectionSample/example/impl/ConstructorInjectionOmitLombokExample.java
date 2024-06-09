package com.example.InjectionSample.example.impl;

import org.springframework.stereotype.Component;

import com.example.InjectionSample.example.Example;
import com.example.InjectionSample.service.SomeService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ConstructorInjectionOmitLombokExample implements Example {

	private final SomeService someService;

	public void run() {
		someService.doService();
	}
}
