package com.csis3275.controller_grp3_assign2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String getHomepage() {
		return "home-grp3-assign2";
	}
	

}
