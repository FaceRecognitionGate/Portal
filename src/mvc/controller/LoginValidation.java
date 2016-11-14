package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginValidation {

	@RequestMapping("loginValidation")
	public String loginValidation() {
		return "";
	}
}
