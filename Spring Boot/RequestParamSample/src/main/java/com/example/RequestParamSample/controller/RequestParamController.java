package com.example.RequestParamSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {

	@GetMapping("show")
	public String showView() {
		return "input";
	}

	@GetMapping("result")
	public String showResultGet(@RequestParam String val, Model model) {
		model.addAttribute("value", val);
		return "output";
	}

	@PostMapping("result")
	public String showResultPost(@RequestParam String val, Model model) {
		model.addAttribute("value", val);
		return "output";
	}
}
