package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	//@RequestMapping(value="/login", method=RequestMethod.Get)
	// short code of above line ->
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
