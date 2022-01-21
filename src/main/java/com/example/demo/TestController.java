package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/h1")
	public String firstHandler() {

		return "home";
	}
	
	@RequestMapping("/")
	public String secondHandler() {

		return "contact";
	}

}
