package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityMapping {

	@RequestMapping("/security/gate")
	public String securityGate() {
		return "gate-access";
	}
	
	@RequestMapping("/security/history")
	public String securityHistory() {
		return "access-history";
	}
	
	@RequestMapping("/security/search")
	public String securitySearch() {
		return "search";
	}
}
