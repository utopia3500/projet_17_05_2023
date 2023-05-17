package main.java.model;

public enum TypeClient {
	PARTICULIER("PARTICULIER"),
	ENTREPRISE("ENTRPRISE"),
	ADMINISTRATION("ADMINISTRATION");
	
	private String nom;
	
	private TypeClient(String nom){
		this.nom = nom;
	}
	
	public String getTypeClient(){
		return this.nom;
	}
}
