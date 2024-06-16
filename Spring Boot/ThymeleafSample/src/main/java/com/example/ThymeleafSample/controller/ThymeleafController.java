package com.example.ThymeleafSample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ThymeleafSample.entity.Member;

@Controller
public class ThymeleafController {
	@GetMapping("show")
	public String showView(Model model) {
		Member member = new Member(1, "number01");
		Member member1 = new Member(25, "Murata");
		Member member2 = new Member(2, "Uchikawa");

		List<String> directionList = new ArrayList<>();
		directionList.add("East");
		directionList.add("West");
		directionList.add("Sourth");
		directionList.add("North");

		Map<String, Member> memberMap = new HashMap<>();
		memberMap.put("Murata", member1);
		memberMap.put("Uchikawa", member2);

		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(member2);

		model.addAttribute("name", "DIO");
		model.addAttribute("member", member);
		model.addAttribute("list", directionList);
		model.addAttribute("map", memberMap);
		model.addAttribute("members", memberList);

		return "main";
	}
}
