package com.example.MyBatisSample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.MyBatisSample.mappler.BookMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {

	private final BookMapper bookMapper;

	@GetMapping("/")
	public String showIndex() {
		return "book/index";
	}

	@GetMapping("/list")
	public String showAllBooks(Model model) {
		model.addAttribute("message", "一覧表示");
		model.addAttribute("books", bookMapper.getAllBooks());
		return "book/success";
	}

	@GetMapping("/detail/{id}")
	public String showBook(@PathVariable int id, Model model) {
		model.addAttribute("message", "詳細表示");
		model.addAttribute("book", bookMapper.getBookById(id));
		return "book/success";
	}
}
