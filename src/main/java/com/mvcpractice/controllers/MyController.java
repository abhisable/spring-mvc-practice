package com.mvcpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping("/home")
	@ResponseBody
	public String homePageRequest() {
		return "displaying home page content";
		
	}
}
