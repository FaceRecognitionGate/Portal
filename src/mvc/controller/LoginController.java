package mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String loginFormGET() {
	  System.out.println("Accessed: /login method=GET");
	  return "login";
  }
  
  @PostMapping("/login")
  public void loginFormPOST() {
	  System.out.println("Accessed: /login method=POST");
  }
  
  @PostMapping("loginValidate")
  public String validateLoginForm(@RequestParam("email") String email, @RequestParam("password") String password) throws ClientProtocolException, IOException {
	  
	  System.out.println("Accessed: /loginValidate");
	  
	  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	  Pattern pattern = Pattern.compile(regex);
	  Matcher matcher = pattern.matcher(email);
	  
	  System.out.println(matcher.matches());
	  
	  if((matcher.matches()) && (password != null && password != "")) {
          System.out.println("if 1");
		  HttpClient client = HttpClients.createDefault();
		  String url = "http://requestb.in/qnht7uqn";

//		  String url = "http://persistenciatecwebeclipse.mybluemix.net/RecebeJsonLogin";
		  HttpPost request = new HttpPost(url);
		  
		  String json = String.format("{\"email\":\"%s\",\"senha\":\"%s\"}", email, password);
		  
		  StringEntity params = new StringEntity(json);
	      request.addHeader("content-type", "application/json");
	      request.setEntity(params);

	      HttpResponse resp = client.execute(request);
	      
	      if(resp.getStatusLine().getStatusCode() == 200) {
	          InputStreamReader stream = new InputStreamReader(resp.getEntity().getContent());
	          BufferedReader br = new BufferedReader(stream);
	          String line;
              System.out.println("if 2");
	          while ((line = br.readLine()) != null) {
	              System.out.println(line);
	          }
	          return "redirect:profile";
	      }
	  }
	  
	  return "login";
  }
  
}
