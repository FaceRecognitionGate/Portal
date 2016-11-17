package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

	@GetMapping("/security/gate")
	public String securityGate() {
		System.out.println("Accessed: /security/gate method=GET");
		return "gate-access";
	}
	
	@GetMapping("/security/history")
	public String securityHistory() {
		System.out.println("Accessed: /security/history method=GET");
		return "access-history";
	}
	
	@GetMapping("/security/search")
	public String securitySearch() {
		System.out.println("Accessed: /security/search method=GET");
		return "search";
	}
	
}
