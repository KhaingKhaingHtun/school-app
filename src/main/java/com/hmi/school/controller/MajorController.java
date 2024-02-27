package com.hmi.school.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hmi.school.entity.Major;
import com.hmi.school.service.MajorService;

@Controller
public class MajorController {
	private final MajorService majorService;

	public MajorController(MajorService majorService) {
		super();
		this.majorService = majorService;
	}

	@GetMapping("/all")
	public String all(Model model) {
		List<Major> majorlist = majorService.getAllMajors();
		model.addAttribute("majorlist", majorlist);
		return "major-list";
	}

	@PostMapping("/create")
	public String create() {
		return "add-major.html";
	}

}
