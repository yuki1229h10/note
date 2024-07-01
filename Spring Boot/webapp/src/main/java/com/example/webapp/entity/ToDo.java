package com.example.webapp.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	private Integer id;
	private String todo;
	private String detail;
	private LocalDate createdAt;
	private LocalDate updatedAt;
}
