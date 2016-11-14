package mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.User;

@Controller
public class LoginMapping {

  @RequestMapping("/login")
  public String login(User user, HttpSession session) {
    return "login";
  }
  
  @RequestMapping("/loginValidation")
  public String loginValidation() {
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	  }
  }
}
