package com.dhub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/user")
	public String showUserMsg() {
		
		return "User has loggedIn!!!";
	}
	
	@RequestMapping("/admin")
	public String showAdminMsg() {
		
		return "Admin has logged In.";
	}
	
}
