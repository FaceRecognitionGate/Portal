package mvc.controller;
import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class SendImage {

  public static void UploadZip() throws Exception {

	  String textFileName = "teste.zip";
	  CloseableHttpClient client = HttpClients.createDefault();
	  HttpPost post = new HttpPost("http://localhost:8080/ReconhecimentoFacial/ProcessEmail");
	  File file = new File("C:/Users/Rafael/Downloads/"+textFileName);
	  String message = "This is a multipart post";
	  MultipartEntityBuilder builder = MultipartEntityBuilder.create();
	  builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
	  //builder.addBinaryBody("upfile", file, ContentType.DEFAULT_BINARY, textFileName);
	  builder.addBinaryBody("upfile", file, ContentType.DEFAULT_BINARY, "img.zip");
	  builder.addTextBody("text", message, ContentType.DEFAULT_BINARY);
	  // 
	  HttpEntity entity = builder.build();
	  post.setEntity(entity);
	  HttpResponse response = client.execute(post);
	  
  }
}