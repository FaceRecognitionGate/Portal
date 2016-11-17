package mvc.controller;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
