package com.example.DISample.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet {
	@Override
	public String greeting() {
		return "こんばんは";
	}
}
