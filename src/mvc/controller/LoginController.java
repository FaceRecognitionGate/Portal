package mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mvc.model.LoginForm;
import mvc.model.User;

@Controller
public class LoginController {

  @GetMapping("login")
  public String loginForm() {
	  System.out.println("GET");
	  return "login";
  }
  
  @PostMapping("login")
  public void loginFormPost() {
	  System.out.println("ENTROU EM LOGIN POST");
  }
  
  @PostMapping("validateLogin")
  public String validateLoginForm(@RequestParam("email") String email, @RequestParam("password") String password) throws ClientProtocolException, IOException {
	  
	  System.out.println("ENTROU EM VALIDATE");
	  
	  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(email);
	  
	  System.out.println(matcher.matches());
	  
	  if((matcher.matches()) && (password != null && password != "")) {
		  
		  HttpClient client = HttpClients.createDefault();
		  String url = "http://requestb.in/qnht7uqn";
		  HttpPost request = new HttpPost(url);
		  
		  String json = String.format("{\"email\":\"%s\",\"password\":\"%s\"}", email, password);
		  
		  StringEntity params = new StringEntity(json);
	      request.addHeader("content-type", "application/json");
	      request.setEntity(params);

	      HttpResponse resp = client.execute(request);
	      
	      if(resp.getStatusLine().getStatusCode() == 200) {
	          InputStreamReader stream = new InputStreamReader(resp.getEntity().getContent());
	          BufferedReader br = new BufferedReader(stream);
	          String line;
	          while ((line = br.readLine()) != null) {
	              System.out.println(line);
	          }
	          return "profile";
	      }
	  }
	  
	  return "login";
  }
  
}
