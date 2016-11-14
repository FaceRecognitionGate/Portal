package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupMapping {

	@RequestMapping("/signup")
	public String signup() {
		System.out.println("Accessed: /signup");
		return "signup";
	}
	
	@RequestMapping("/signupValidation")
	public String signupValidation() {
		System.out.println("Accessed: /signupValidation");
		return "";
	}
	
}
