package mvc.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import com.google.gson.Gson;

public class LoginForm {
    
	@Email
    private String email;
	
	@NotNull
    private String password;
    
	Gson gson = new Gson();

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    
    public void initJson() {
    	gson.toJson(email);
    	gson.toJson(password);
    }
    
    public Gson getJson() {
    	return gson;
    }
}