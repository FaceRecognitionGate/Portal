package mvc.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.omg.CORBA.portable.InputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Login;

@Controller
public class DashboardController {
	
	  public static String excutePost(String targetURL, String urlParameters)
	  {
	    URL url;
	    HttpURLConnection connection = null;  
	    try {
	      //Create connection
	      url = new URL(targetURL);
	      connection = (HttpURLConnection)url.openConnection();
	      connection.setRequestMethod("POST");
	      connection.setRequestProperty("Content-Type", 
	           "application/x-www-form-urlencoded");
				
	      connection.setRequestProperty("Content-Length", "" + 
	               Integer.toString(urlParameters.getBytes().length));
	      connection.setRequestProperty("Content-Language", "en-US");  
				
	      connection.setUseCaches (false);
	      connection.setDoInput(true);
	      connection.setDoOutput(true);

	      //Send request
	      DataOutputStream wr = new DataOutputStream (
	                  connection.getOutputStream ());
	      wr.writeBytes (urlParameters);
	      wr.flush ();
	      wr.close ();

	      //Get Response	
	      java.io.InputStream is = connection.getInputStream();
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	      String line;
	      StringBuffer response = new StringBuffer(); 
	      while((line = rd.readLine()) != null) {
	        response.append(line);
	        response.append('\r');
	      }
	      rd.close();
	      return response.toString();

	    } catch (Exception e) {

	      e.printStackTrace();
	      return null;

	    } finally {

	      if(connection != null) {
	        connection.disconnect(); 
	      }
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
  public String loginValidation(Login login) {
	  login.initJson();
	  System.out.println("Accessed mapping: /login-validation");
	  return "login-validation";
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
  
  @RequestMapping("/recebeJsonLogin")
  public String jsonLogin() {
	  System.out.println("Accessed mapping: /json-Login");
	  return "jsonLogin";
  }

}
