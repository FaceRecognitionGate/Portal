package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupValidation {

	@RequestMapping("/validateSignup")
	public String validateSignup() {
		System.out.println("Accessed: /validateSignup");
		return "";
	}
	
}
