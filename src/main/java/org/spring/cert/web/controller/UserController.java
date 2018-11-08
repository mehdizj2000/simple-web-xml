package org.spring.cert.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

	@RequestMapping("/list")
	public String home(Model model) {
		return "/users/user-list";
	}
	
	@RequestMapping("/edit")
	public String login(Model model) {
		return "/users/user-edit";
	}
	
	@RequestMapping("/info")
	public String login1(Model model) {
		return "/users/user-info";
	}
}
