package com.example.CorrelationValidationSample.form;

import java.util.Objects;

import jakarta.validation.constraints.AssertTrue;
import lombok.Data;

@Data
public class SampleForm {
	private String password;
	private String confirmPassword;

	@AssertTrue(message = "パスワードが一致しません")
	public boolean isSamePassword() {
		return Objects.equals(password, confirmPassword);
	}
}
