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
  
  @RequestMapping("/profile")
  public String profile() {
    System.out.println("Accessed mapping: /profile");
    return "profile";
  }
  
  @RequestMapping("/profile/edit")
  public String editProfile() {
    System.out.println("Accessed mapping: /edit-profile");
    return "edit-profile";
  }
  
  @RequestMapping("/security/gate")
  public String gateAccess() {
    System.out.println("Accessed mapping: /security/gate");
    return "gate-access";
  }
  
  @RequestMapping("/security/history")
  public String accessHistory() {
    System.out.println("Accessed mapping: /security/history");
    return "access-history";
  }

}
