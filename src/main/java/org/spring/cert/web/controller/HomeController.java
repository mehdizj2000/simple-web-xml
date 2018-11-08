package org.spring.cert.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping("/auth")
	public String login(Model model) {
		return "auth";
	}
}
