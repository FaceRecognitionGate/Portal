package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {
  
  @RequestMapping("/")
  public String index() {
    System.out.println("Accessed mapping: /");
    return "login";
  }
  
  @RequestMapping("/signup")
  public String signup() {
    System.out.println("Accessed mapping: /signup");
    return "signup";
  }
  
  @RequestMapping("/login-validation")
  public String loginValidation() {
	  System.out.println("Accessed mapping: /login-validation");
	  return "login-validation";
  }
  
  @RequestMapping("/profile")
  public String profile() {
	  System.out.println("Accessed mapping: /profile");
	  return "profile";
  }
  
  @RequestMapping("/edit-profile")
  public String editProfile() {
    System.out.println("Accessed mapping: /edit-profile");
    return "edit-profile";
  }
  
  @RequestMapping("/gate-access")
  public String gateAccess() {
    System.out.println("Accessed mapping: /gate-access");
    return "gate-access";
  }
  
  @RequestMapping("/access-history")
  public String accessHistory() {
    System.out.println("Accessed mapping: /access-history");
    return "access-history";
  }
  
  @RequestMapping("/recebeJsonLogin")
  public String jsonLogin() {
	  System.out.println("Accessed mapping: /json-Login");
	  return "jsonLogin";
  }

}
