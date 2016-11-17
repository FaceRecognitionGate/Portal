package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping(value="/profile")
	public String profile() throws Exception {
		SendImage.UploadZip();
		return "profile";
	}
	
	@RequestMapping(value="/profile/edit")
	public String profileEdit() {
		return "edit-profile";
	}
}