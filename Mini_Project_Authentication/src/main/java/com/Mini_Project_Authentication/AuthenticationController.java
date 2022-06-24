package com.Mini_Project_Authentication;


	import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class AuthenticationController {	
		@GetMapping("/")
		String getPublicMessage() {
			return "Hello everyone";
		}
		
		@GetMapping("/users")
		String getUserMessage() {
			return "Hi User, you are now logged in...";
		}
	}


