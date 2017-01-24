package com.goldtending.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// add request mapping
	@RequestMapping("/")
	public String showPage() {
		// return view
		return "main-menu";
	}
}