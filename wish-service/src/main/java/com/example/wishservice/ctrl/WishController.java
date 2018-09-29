package com.example.wishservice.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishController {
	@GetMapping
	@RequestMapping("/wish")
	public String doWish() {
		
		return "hi this is boot with maven with jenkins";
	}

}
