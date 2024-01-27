package com.freshvotes.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	// Listen to this http GET request on this URL ("/")
	@GetMapping(value="/")
	public String rootView() {
		// Return Index View
		return "index";
	}
}
