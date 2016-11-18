package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.User;

@Controller
public class ProfileController {

	@RequestMapping("/profile")
	public String profile(@ModelAttribute("User") final User user,final BindingResult mapping1BindingResult,
	        final Model model) {
	    model.addAttribute("nome", user.getFirstName());
	    model.addAttribute("sobrenome", user.getLastName());
	    model.addAttribute("sexo", user.getGender());
	    model.addAttribute("email", user.getEmail());
	    model.addAttribute("numeroMatricula", user.getId());
	    model.addAttribute("profissao", user.getCategory());
	    model.addAttribute("rg", user.getRg());
		return "profile";
	}
	
	@RequestMapping("/profile/edit")
	public String profileEdit() throws Exception {
		return "edit-profile";
	}
}