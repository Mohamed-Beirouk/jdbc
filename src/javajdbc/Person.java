package javajdbc;
public class Person {
	
	private int id;
	private String nom, prenom;
	Person(){}
	
	Person(int id, String n, String p){
	this.id=id; nom=n; prenom=p;
	}
	public int getId(){ return id; }
	
	public String getNom(){ return nom; }
	
	public String getPrenom(){ return prenom;}
	
	public void setId(int id){this.id=id; }
	
	public void setNom(String n){nom=n;}
	
	public void setPrenom(String p){ prenom=p; }
	
}


