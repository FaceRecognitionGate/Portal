package mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mvc.model.*;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String loginFormGET() {
	  System.out.println("Accessed: /login method=GET");
	  return "login";
  }
  
  @PostMapping("loginValidate")
  public String validateLoginForm(@ModelAttribute("User") User user, final Model model, 
	        final RedirectAttributes redirectAttributes,@RequestParam("email") String email, @RequestParam("password") String password) throws ClientProtocolException, IOException {
	  System.out.println("Accessed: /loginValidate method=POST");
	  
	  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(email);
	  
	  System.out.println(matcher.matches());
	  
	  if((matcher.matches()) && (password != null && password != "")) {

          
		  System.out.println("if 1");
		  
          HttpClient client = HttpClients.createDefault();
		  String url = "http://persistenciatecwebeclipse.mybluemix.net/RecebeJsonLogin";

		  HttpPost request = new HttpPost(url);
		  
		  String json = String.format("{\"email\":\"%s\",\"senha\":\"%s\"}", email, password);
		  
		  List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		  urlParameters.add(new BasicNameValuePair("json",json));
	      request.setEntity(new UrlEncodedFormEntity(urlParameters));

	      HttpResponse resp = client.execute(request);
	      user = null;
	      if(resp.getStatusLine().getStatusCode() == 200) {
	          InputStreamReader stream = new InputStreamReader(resp.getEntity().getContent());
	          BufferedReader br = new BufferedReader(stream);
	          String line;
              System.out.println("if 2");
	          while ((line = br.readLine()) != null) {
	              System.out.println(line);
	              Gson gson = new Gson();
	              user = (User) gson.fromJson(line, User.class);
	              System.out.println(user.getFirstName()+" "+user.getLastName()+" "+user.getEmail()+" "+user.getGender()+" "+user.getRg()+" "+user.getCategory()+" "+user.getId()+" ");
	          }
	          redirectAttributes.addFlashAttribute("User", user);
		      return "redirect:/profile";
	      }
	  }
	  
	  return "login";
  }
  
}
