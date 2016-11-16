package mvc.model;

import com.google.gson.Gson;

public class Rg {
    
    private String rg;
    
	Gson gson = new Gson();

    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}
    
    public void initJson() {
    	gson.toJson(rg);
    }
    
    public Gson getJson() {
    	return gson;
    }
}