package com.example.PathVariableSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PathValiableController {

	@GetMapping("show")
	public String showView() {
		return "show";
	}
}
