package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String signup() {
		System.out.println("Accessed: /signup method=GET");
		return "signup";
	}
	
	@PostMapping("signupValidate")
	public String signupValidatePOST() {
		System.out.println("Accessed: /signupValidate method=POST");
		return "";
	}
	
}
