package com.example.CorrelationValidationSample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.CorrelationValidationSample.form.SampleForm;

@Controller
public class CheckController {
	@GetMapping()
	public String showForm(SampleForm form) {
		return "entry";
	}

	@PostMapping
	public String check(@Validated SampleForm form, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "entry";
		}
		model.addAttribute("message", "入力に問題ありません");
		return "result";
	}
}
