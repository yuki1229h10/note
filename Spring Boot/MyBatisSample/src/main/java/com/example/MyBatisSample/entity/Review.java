package com.example.MyBatisSample.entity;

import lombok.Data;

@Data
public class Review {
	private int id;
	private int bookId;
	private String reviewText;
}
