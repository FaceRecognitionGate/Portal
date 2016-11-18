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
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;

import mvc.model.User;

@Controller
public class SecurityController {

	@GetMapping("security/gate")
	public String securityGate() {
		System.out.println("Accessed: /security/gate method=GET");
		return "gate-access";
	}
	
	@GetMapping("/security/history")
	public String securityHistory() {
		System.out.println("Accessed: /security/history method=GET");
		return "access-history";
	}
	
	@GetMapping("/security/search")
	public String securitySearch() {
		System.out.println("Accessed: /security/search method=GET");
		return "search";
	}
	
	@PostMapping("/security/rgValidate")
	  public String validateRgForm(@ModelAttribute("User") User user, final Model model, 
		        final RedirectAttributes redirectAttributes,@RequestParam("rg") String rg) throws ClientProtocolException, IOException {
		  System.out.println("Accessed: /rgValidate method=POST");
		  
//		  String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
//		  Pattern pattern = Pattern.compile(regex);
//		  Matcher matcher = pattern.matcher(rg);
//		  
//		  System.out.println(matcher.matches());
		  
		  if(rg != null && rg != "") {
	          
			  System.out.println("if 1");
			  
	          HttpClient client = HttpClients.createDefault();
			  String url = "http://persistenciatecwebeclipse.mybluemix.net/RecebeEmail";
			  HttpPost request = new HttpPost(url);
			  
			  String json = String.format("{\"rg\":\"%s\"}", rg);
			  
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
			      return "redirect:/security/profile";
		      }
		  }
		  
		  return "security/rgValidate";
	  }
	
	@RequestMapping("security/profile")
	public String profile(@ModelAttribute("User") final User user,final BindingResult mapping1BindingResult,
	        final Model model) {
	    model.addAttribute("nome", user.getFirstName());
	    model.addAttribute("sobrenome", user.getLastName());
	    model.addAttribute("sexo", user.getGender());
	    model.addAttribute("email", user.getEmail());
	    model.addAttribute("numeroMatricula", user.getId());
	    model.addAttribute("profissao", user.getCategory());
	    model.addAttribute("rg", user.getRg());
		return "profile-security";
	}
	
	@PostMapping("security/open")
	public String openGate() throws ClientProtocolException, IOException {
		System.out.println("Accessed: /security/open method=POST");
		
		HttpClient client = HttpClients.createDefault();
		String url = "http://10.91.18.15:8080/Servo_Catraca/open2";
		HttpGet request = new HttpGet(url);
		
		HttpResponse resp = client.execute(request);
		
		if(resp.getStatusLine().getStatusCode() == 200) {
			System.out.println("Abriu a catraca!");
			return "redirect:../security/gate";
		}
		
		return "redirect:../security/gate";
	}
	
}
