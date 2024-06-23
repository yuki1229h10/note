package com.example.ValidationSample.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.ValidationSample.form.CalcForm;

@Component
public class CalcValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return CalcForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		CalcForm form = (CalcForm) target;
		if (form.getLeftNum() != null && form.getRightNum() != null) {
			if (!((form.getLeftNum() % 2 == 1) && (form.getRightNum() % 2 == 0))) {
				errors.rejectValue("leftNum", null, "左側の数値は奇数、右側の数値は偶数でなければなりません。");
			}
		}
	}
}
