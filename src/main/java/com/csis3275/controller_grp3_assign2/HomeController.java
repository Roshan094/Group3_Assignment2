package com.csis3275.controller_grp3_assign2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_grp3_assign2.Selfie_rka_34;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String getHomepage() {
		return "home-grp3-assign2";
	}
	
//	Creating new model
	Selfie_rka_34 s1 = new Selfie_rka_34("Roshan","Karki","300371634","Group 3 - member 3");

//	with url rka_34.html
	@GetMapping("/rka_34")
	public String smartPhoneDetails(Model model) {
		model.addAttribute("selfiS1", s1);
		return "selfie/rka_34";
	}

}
