package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
/*
 * @RequestMapping
 * http://localhost:8080/users
 * このクラスのメソッドは全て、上の(例)URLから始まる
 */
@RequestMapping("/")
public class UserController {
	/*
	 * @Autowired
	 * newしなくてもインスタンス化して使用可能
	 */
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String index() {
		return "login";
	}

	@PostMapping("/login")
	public String login() {
		return "list";
	}

	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}

	@PostMapping("/signup")
	public void signupPost(@ModelAttribute User user) {
		userService.save(user);
	}

}
