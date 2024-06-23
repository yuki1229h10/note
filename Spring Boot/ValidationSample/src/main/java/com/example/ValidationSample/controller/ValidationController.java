package com.example.ValidationSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ValidationSample.form.CalcForm;
import com.example.ValidationSample.validator.CalcValidator;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ValidationController {

	private final CalcValidator calcValidator;

	@InitBinder("calcForm")
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(calcValidator);
	}

	@ModelAttribute
	public CalcForm setUpForm() {
		return new CalcForm();
	}

	@GetMapping("show")
	public String showView() {
		return "entry";
	}

	@PostMapping("calc")
	public String confirmView(@Validated CalcForm form, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "entry";
		}

		Integer calcResult = form.getLeftNum() + form.getRightNum();
		model.addAttribute("result", calcResult);
		return "confirm";
	}
}
