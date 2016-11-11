package mvc.model;

import com.google.gson.Gson;

public class Login {
    
    private String email;
    
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