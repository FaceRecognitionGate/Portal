package mvc.controller;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Login;

@Controller
public class DashboardController {
	
	@SuppressWarnings("deprecation")
	private void URLPost(String content, String URL) throws IOException {
		  URL url = null;
		  url = new URL(URL);
		  HttpURLConnection urlConn = null;
		  urlConn = (HttpURLConnection) url.openConnection();
		  urlConn.setDoInput(true);
		  urlConn.setDoOutput(true);
		  urlConn.setRequestMethod("POST");
		  urlConn.setRequestProperty("Content-Type", "application/json");
		  urlConn.connect();
			
		  DataOutputStream output = null;
		  DataInputStream input = null;
		  output = new DataOutputStream(urlConn.getOutputStream());


		  /*Construct the POST data.*/
		  String postContent = content;
		
		  /* Send the request data.*/
		  output.writeBytes(postContent);
		  output.flush();
		  output.close();
			
		  /* Get response data.*/
		  String response = null;
		  input = new DataInputStream (urlConn.getInputStream());
		  while (null != ((response = input.readLine()))) {
			  System.out.println(response);
			  input.close ();
		  }
	}
  
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
  public String loginValidation(Login login) throws IOException{
	  login.initJson();
	  String content = login.getJson().toString();
	  String URL = "https://www.persistenciatecwebeclipse.mybluemix.net";
	  URLPost (content, URL);
	  return "login-validation";
  }

  
  @RequestMapping("/profile")
  public String profile() {
	  System.out.println("Accessed mapping: /profile");
	  return "profile";
  }
  
  @RequestMapping("/profile/edit")
  public String editProfile() throws Exception {
	SendImage.UploadZip();
    System.out.println("Accessed mapping: /profile/edit");
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
  
  @RequestMapping("/search")
  public String search() {
    System.out.println("Accessed mapping: /search");
    return "search";
  }

}
