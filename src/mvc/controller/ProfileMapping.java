package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileMapping {

	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/profile/edit")
	public String profileEdit() throws Exception {
		SendImage.UploadZip();
		return "edit-profile";
	}
}
