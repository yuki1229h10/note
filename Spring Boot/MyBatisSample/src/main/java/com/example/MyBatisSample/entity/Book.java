package com.example.MyBatisSample.entity;

import java.util.List;

import lombok.Data;

@Data
public class Book {
	private int id;
	private String title;
	private String author;
	private Publisher publisher;
	private List<Review> reviews;
}
