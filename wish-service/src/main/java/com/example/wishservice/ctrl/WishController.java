package com.example.wishservice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class WishController {
	@GetMapping
	@RequestMapping("/wish")
	public String doWish() {
		
		return "hi this is boot with maven with jenkins";
	}
	
	@RequestMapping("/data")
	public String getData() {
		
		
		
		return "currently no data available !";
	}

}
