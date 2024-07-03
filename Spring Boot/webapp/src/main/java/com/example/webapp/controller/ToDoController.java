package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.webapp.entity.ToDo;
import com.example.webapp.service.ToDoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/todos")
@RequiredArgsConstructor
public class ToDoController {

	private final ToDoService toDoService;

	@GetMapping
	public String list(Model model) {
		model.addAttribute("todos", toDoService.findAllToDo());
		return "todo/list";
	}

	@GetMapping("/{id}")
	public String detail(@PathVariable Integer id, Model model, RedirectAttributes attributes) {

		ToDo toDo = toDoService.findByIdToDo(id);

		if (toDo != null) {
			model.addAttribute("todo", toDoService.findByIdToDo(id));
			return "todo/detail";
		} else {
			attributes.addFlashAttribute("errorMessage", "対象データがありません");
			return "redirect:/todos";
		}
	}
}
