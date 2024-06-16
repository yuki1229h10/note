package com.example.RequestParamSample.form;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SampleForm {
	private String name;
	private Integer age;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate birth;
}
