package mvc.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String signup() {
		System.out.println("Accessed: /signup method=GET");
		return "signup";
	}
	
	@PostMapping("signupValidate")
	public String signupValidatePOST() throws IOException {
		  System.out.println("ENTROU EM VALIDATE");
		  
		  
		  			  
		  HttpClient client = HttpClients.createDefault();
		  String url1 = "nuclinux:8080/ReconhecimentoFacial/ProcessEmail";
		  String url = "http://requestb.in/qnht7uqn";
		  HttpPost request = new HttpPost(url);
		  		  
		  List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		  urlParameters.add(new BasicNameValuePair("email", "faustosilva@globo.com"));
		  urlParameters.add(new BasicNameValuePair("link", "http://s000.tinyupload.com/index.php?file_id=23502791499164252735"));

		  request.setEntity(new UrlEncodedFormEntity(urlParameters));

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
		return "signup";
	  }
}
	

