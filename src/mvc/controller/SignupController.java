package mvc.controller;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignupController {
	

	@GetMapping("/signup")
	public String signup() {
		System.out.println("Accessed: /signup method=GET");
		return "signup";
	}
	
	@RequestMapping("webcam-test")
	public String webcam() {
		return "webcam-upload-test";
	}
	
	@RequestMapping("/imageUpload")
	public void test (@RequestBody String png) throws IOException {
		String [] parts = png.split(",");
		String png64 = parts[1];
		byte [] imageByte;
		BufferedImage image = null;
		
		imageByte = Base64.getDecoder().decode(png64);
		ByteArrayInputStream bis = new ByteArrayInputStream(imageByte);
		image = ImageIO.read(bis);
		bis.close();
		
		File teste = new File("C:/Users/Gustavo/Desktop/tmp/Portal/images.png");
		ImageIO.write(image, "PNG", teste);
		
		System.out.println("Test"+png);
	}
	
	@PostMapping("signupValidate")
	public String signupValidatePOST(@RequestParam("nome") String firstName, @RequestParam("sobrenome") String lastName,
			@RequestParam("email") String email, @RequestParam("senha") String password, @RequestParam("confirm-password") String confirmPassword,
			@RequestParam("sexo") String gender, @RequestParam("rg") String rg, @RequestParam("profissao") String category, @RequestParam("numeroMatricula") String id) throws IOException {
		
		String [] src = {"C:/Users/Gustavo/Desktop/tmp/Portal/images.png"};
		String zipUrl = "C:/Users/Gustavo/Desktop/tmp/Portal/teste.zip";
		
		ZipFiles.Zip(zipUrl, src);
		String url = "10.92.0.253:8080/Portal/teste.zip";
		
		HttpClient frClient = HttpClients.createDefault();
		String frUrl = "http://nuclinux:8080/ReconhecimentoFacial/ProcessEmail";
		HttpPost frRequest = new HttpPost(frUrl);
		List<NameValuePair> frUrlParameters = new ArrayList<NameValuePair>();
		frUrlParameters.add(new BasicNameValuePair("email", email));
		frUrlParameters.add(new BasicNameValuePair("link", "http://requestb.in/qnht7uqn"));
		frRequest.setEntity(new UrlEncodedFormEntity(frUrlParameters));
	    HttpResponse frResp = frClient.execute(frRequest);
	    
	    //POST Request (Database)
	    HttpClient dbClient = HttpClients.createDefault();
		String dbUrl = "http://persistenciatecwebeclipse.mybluemix.net/RecebeJsonDadosPessoais";
		HttpPost dbRequest = new HttpPost(dbUrl);
		String json = String.format("{\"nome\":\"%s\",\"sobrenome\":\"%s\",\"email\":\"%s\",\"senha\":\"%s\",\"sexo\":\"%s\",\"rg\":\"%s\",\"profissao\":\"%s\",\"numeroMatricula\":\"%s\"}", firstName, lastName, email, password, gender, rg, category, id);
		List<NameValuePair> dbUrlParameters = new ArrayList<NameValuePair>();
		dbUrlParameters.add(new BasicNameValuePair("json",json));
	    dbRequest.setEntity(new UrlEncodedFormEntity(dbUrlParameters));
	    HttpResponse dbResp = dbClient.execute(dbRequest);
	    
	    //POST Response (Database)
	    if(dbResp.getStatusLine().getStatusCode() == 200) {
	    	InputStreamReader stream = new InputStreamReader(dbResp.getEntity().getContent());
	        BufferedReader br = new BufferedReader(stream);
	        String line;
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        }
	        
	        return "redirect:/login";
	    }
	    
	    return "redirect:/signup";
	  }
}
	

