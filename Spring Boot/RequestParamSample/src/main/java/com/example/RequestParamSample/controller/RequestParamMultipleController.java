package com.example.RequestParamSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.RequestParamSample.form.SampleForm;

@Controller
public class RequestParamMultipleController {

	@GetMapping("multiple")
	public String showView() {
		return "entry";
	}

	//	@PostMapping("confirm")
	//	public String showView(Model model, @RequestParam String name, @RequestParam Integer age,
	//			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth) {
	//		model.addAttribute("name", name);
	//		model.addAttribute("age", age);
	//		model.addAttribute("birth", birth);
	//		return "confirm";
	//	}

	@PostMapping("confirm")
	public String showView(SampleForm form) {
		return "confirm2";
	}
}
