package kh.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		//ah .... michigetneys
		System.out.println("HI");
		return "home";
	}
	
}
