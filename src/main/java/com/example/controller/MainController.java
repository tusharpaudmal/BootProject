package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value="/")
	public String reg() {
		
		System.out.println("in controller..");
		return "index";
	}
}
