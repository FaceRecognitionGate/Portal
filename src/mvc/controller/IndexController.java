package mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(HttpServletRequest request, HttpSession session) {
		if(request.getSession(false).getAttribute("LOGGED_USER_ID") == null) {
			return "redirect:/login";
		} else {
			return "redirect:/profile";
		}
	}
	
}
