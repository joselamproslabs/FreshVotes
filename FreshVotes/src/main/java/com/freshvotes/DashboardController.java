package com.freshvotes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

	// Listen to this http GET request on this URL ("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String rootView() {
		// Return Index View
		return "index";
	}
}
