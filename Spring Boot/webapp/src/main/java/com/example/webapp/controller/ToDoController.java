package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.webapp.entity.ToDo;
import com.example.webapp.form.ToDoForm;
import com.example.webapp.helper.ToDoHelper;
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

	@GetMapping("/form")
	public String newToDo(@ModelAttribute ToDoForm form) {
		form.setIsNew(true);
		return "todo/form";
	}

	@PostMapping("/save")
	public String create(ToDoForm form, RedirectAttributes attributes) {
		ToDo ToDo = ToDoHelper.convertToDo(form);
		toDoService.insertToDo(ToDo);
		attributes.addFlashAttribute("message", "新しいToDoが作成されました");
		return "redirect:/todos";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model, RedirectAttributes attributes) {
		ToDo target = toDoService.findByIdToDo(id);
		if (target != null) {
			ToDoForm form = ToDoHelper.convertToDoForm(target);
			model.addAttribute("toDoForm", form);
			return "todo/form";
		} else {
			attributes.addFlashAttribute("errorMessage", "対象データがありません");
			return "redirect://todos";
		}
	}

	@PostMapping("/update")
	public String update(ToDoForm form, RedirectAttributes attributes) {
		ToDo ToDo = ToDoHelper.convertToDo(form);
		toDoService.updateToDo(ToDo);
		attributes.addFlashAttribute("message", "ToDoが更新されました");
		return "redirect:/todos";
	}

}
