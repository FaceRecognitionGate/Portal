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
		
		File teste = new File("C:/Users/Rafael/Documents/GitHub/Portal/Images.png");

		ImageIO.write(image, "PNG", teste);
		
		System.out.println("Test"+png);
	}
	
	@PostMapping("signupValidate")
	public String signupValidatePOST() throws IOException {
		  System.out.println("ENTROU EM VALIDATE");
		  
		  String [] src = {"C:/Users/Rafael/Documents/GitHub/Portal/Images.png"};
		  String zipUrl = "C:/Users/Rafael/Documents/GitHub/Portal/teste.zip";
		  
		  String testeUrl = "http://requestb.in/19axero1";
		  String nuc = "http://nuclinux:8080/ReconhecimentoFacial/ProcessEmail";
		  ZipFiles.Zip(zipUrl, src);
		  
		  HttpClient client = HttpClients.createDefault();
		  String url1 = nuc;
		  String url = "http://requestb.in/qnht7uqn";
		  HttpPost request = new HttpPost(url1);
		  
		  String zipPost = "10.91.16.76:8080/Portal/teste.zip";
		  
		  List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		  urlParameters.add(new BasicNameValuePair("email", "faustosilva@globo.com"));
		  urlParameters.add(new BasicNameValuePair("link", zipPost));

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
	

