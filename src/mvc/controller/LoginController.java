package mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.User;

@Controller
public class LoginController {

  @RequestMapping("/login")
  public String login(User user, HttpSession session) {
    return "";
  }
}
