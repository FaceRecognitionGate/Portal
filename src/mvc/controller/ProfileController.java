package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

<<<<<<< HEAD
	@RequestMapping(value="/profile")
	public String profile() throws Exception {
		SendImage.UploadZip();
		return "profile";
	}
	
	@RequestMapping(value="/profile/edit")
	public String profileEdit() {
=======
	@RequestMapping("/profile")
	public String profile() {
		return "profile";
	}
	
	@RequestMapping("/profile/edit")
	public String profileEdit() throws Exception {
>>>>>>> 1787b5d8cd3479111e1388045b9ee9dad6b8f89d
		return "edit-profile";
	}
}