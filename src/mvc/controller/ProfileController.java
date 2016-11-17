package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/profile/edit")
	public String profileEdit() throws Exception {
		return "edit-profile";
	}
}