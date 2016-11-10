package net.mybluemix.catracainsper.control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.mybluemix.catracainsper.model.User;

@Controller
public class LoginController {

  @RequestMapping("/login")
  public String login(User user, HttpSession session) {
    return "";
  }
}
