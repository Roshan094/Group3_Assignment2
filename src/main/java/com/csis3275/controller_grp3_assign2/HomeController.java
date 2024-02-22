package com.csis3275.controller_grp3_assign2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model_grp3_assign2.Selfie_Mau_62;
import com.csis3275.model_grp3_assign2.Selfie_rka_34;


@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String getHomepage() {
		return "home-grp3-assign2";
	}
	
//	Creating new model
	Selfie_rka_34 s1 = new Selfie_rka_34("Roshan","Karki","300371634","Group 3 - member 2");

//	with url rka_34.html
	@GetMapping("/rka_34")
	public String smartPhoneDetails(Model model) {
		model.addAttribute("selfiS1", s1);
		return "selfie/rka_34";
	}
//creating another model
	Selfie_Mau_62 S2 = new Selfie_Mau_62("Mauricio","Diaz","300361362","Group 3 -menber 3");
		
		
//with url Mau_62.html
		@GetMapping("/Mau_62")
		public String detail(Model model) {
			model.addAttribute("selfiS2",S2);
			return "selfie/Mau_62";
		}

}
