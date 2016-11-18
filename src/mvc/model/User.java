package mvc.model;

public class User {

	private String nome;
	private String sobrenome;
	private String email;
	private String password;
	private String sexo;
	private String rg;
	private String profissao;
	private String numeroMatricula;
  
	public String getFirstName() {return nome;}
	public void setFirstName(String nome) {this.nome = nome;}
  
	public String getLastName() {return sobrenome;}
	public void setLastName(String sobrenome) {this.sobrenome = sobrenome;}
  
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
  
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getGender() {return sexo;}
	public void setGender(String sexo) {this.sexo = sexo;}
  
	public String getRg() {return rg;}
	public void setRg(String rg) {this.rg = rg;}
  
	public String getCategory() {return profissao;}
	public void setCategory(String profissao) {this.profissao = profissao;}
  
	public String getId() {return numeroMatricula;}
	public void setId(String numeroMatricula) {this.numeroMatricula = numeroMatricula;}  
  
}
