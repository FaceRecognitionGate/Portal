package net.mybluemix.catracainsper.model;

import com.google.gson.Gson;

public class Signup {
    
    private String firstname;
    private String lastname;
    private String email;   
    private String confirmpassword;  
    private String gender;  
    private String rg;
    private String category;
    private String id;
    
	Gson gson = new Gson();

    public String getFirstName() {return firstname;}
    public void setFirstName(String firstname) {this.firstname = firstname;}
    
    public String getLastName() {return lastname;}
    public void setLastName(String lastname) {this.lastname = lastname;}
    
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    
    public String getConfimPassword() {return confirmpassword;}
    public void setEmailPassword(String confirmpassword) {this.confirmpassword = confirmpassword;}
    
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    
    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}
    
    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}
    
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    
    
    public void initJson() {
    	gson.toJson(firstname);
    	gson.toJson(lastname);
    	gson.toJson(email);
    	gson.toJson(confirmpassword);
    	gson.toJson(gender);
    	gson.toJson(category);
    	gson.toJson(id);
    }
    
    public Gson getJson() {
    	return gson;
    }
}