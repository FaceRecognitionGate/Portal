package mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import mvc.model.*;

@Controller
public class SessionController {

  @GetMapping("/login")
  public String loginFormGET() {
	  System.out.println("Accessed: /login method=GET");
	  return "login";
  }
  
  @PostMapping("loginValidate")
  public String validateLoginForm(@ModelAttribute("user") User user, @RequestParam("email") String email, @RequestParam("password") String password, HttpSession session) throws ClientProtocolException, IOException {
	  
	  System.out.println("Accessed: /loginValidate method=POST");
	  
	  user = null;
	  
	  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(email);

	  //System.out.println(matcher.matches());
	  
	  if((matcher.matches()) && (password != null && password != "")) {
		  
		  //POST Request
          HttpClient client = HttpClients.createDefault();
		  String url = "http://persistenciatecwebeclipse.mybluemix.net/RecebeJsonLogin";
		  HttpPost request = new HttpPost(url);
		  String json = String.format("{\"email\":\"%s\",\"senha\":\"%s\"}", email, password);
		  List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		  urlParameters.add(new BasicNameValuePair("json",json));
	      request.setEntity(new UrlEncodedFormEntity(urlParameters));
	      HttpResponse resp = client.execute(request);
	      
	      //POST Response
	      Gson gson = new Gson();
	      if(resp.getStatusLine().getStatusCode() == 200) {
	          InputStreamReader stream = new InputStreamReader(resp.getEntity().getContent());
	          BufferedReader br = new BufferedReader(stream);
	          String line;	          
	          while((line = br.readLine()) != null) {
	              user = (User) gson.fromJson(line, User.class);
	              if(user == null) {
	            	  return "redirect:/login";
	              }
	          }
	          
	          session.setAttribute("USER_OBJ", user);
	          session.setAttribute("LOGGED_USER_ID", user.getId());
		      return "redirect:/profile";
	      }
	  }
	  
	  return "redirect:/login";
  }
  
  @GetMapping("logout")
  public String logout(HttpSession session) {
	  session.invalidate();
	  return "redirect:/login";
  }
  
}
