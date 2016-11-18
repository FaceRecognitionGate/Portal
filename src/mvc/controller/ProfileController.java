package mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.User;

@Controller
public class ProfileController {

	@RequestMapping("/profile")
	public String profile(final Model model, HttpSession session) {
	    
		User user = (User) session.getAttribute("USER_OBJ");
		
		if(user != null) {
			model.addAttribute("nome", user.getFirstName());
		    model.addAttribute("sobrenome", user.getLastName());
		    model.addAttribute("sexo", user.getGender());
		    model.addAttribute("email", user.getEmail());
		    model.addAttribute("numeroMatricula", user.getId());
		    model.addAttribute("profissao", user.getCategory());
		    model.addAttribute("rg", user.getRg());
			return "profile";
		} else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping("/profile/edit")
	public String profileEdit() throws Exception {
		return "edit-profile";
	}
}