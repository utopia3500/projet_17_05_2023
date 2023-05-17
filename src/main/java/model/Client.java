package main.java.model;

import java.time.LocalDate;

public class Client extends Personne{
	
	private TypeClient typeClient;
	
	public Client(String prenom, String nom, LocalDate dateDeNaissance, TypeClient typeClient){
		super(prenom, nom, dateDeNaissance);
		this.typeClient = typeClient;
	}
	
	@Override
	public void afficher(){
		
		super.afficher();
		
		switch(typeClient){
   			case PARTICULIER:
   				System.out.println("Type de Client : Particulier");
   				break;
   			
   			case ENTREPRISE:
   				System.out.println("Type de Client : Entreprise");
   				break;
   			
   			case ADMINISTRATION:
   				System.out.println("Type de Client : administration");
   				break;
   			
   			default:
   				System.out.println("Type de Client: inconnu");
		}
		
		System.out.println();
	}
	
	@Override
	public void afficher(boolean francais)  
	{  
	   
		   super.afficher(francais);
	       
	       switch(typeClient){
	       		case PARTICULIER:
	       			System.out.println("Type de Client : Particulier");
	       			break;
	       			
	       		case ENTREPRISE:
	       			System.out.println("Type de Client : Entreprise");
	       			break;
	       			
	       		case ADMINISTRATION:
	       			System.out.println("Type de Client : administration");
	       			break;
	       			
	       		default:
	       			System.out.println("Type de Client: inconnu");
	       }
	       System.out.println();
	   
	   }  
	   
	   
	@Override
	public boolean equals(Object obj){
		Client c;
		if (obj == null || obj.getClass()!= this.getClass()){
			return false;
		}else{
			c = (Client)obj;
			
			if (c.getPrenom().equals(this.getPrenom()) &&
					c.getNom().equals(this.getNom()) &&
					c.getDateDeNaissance().equals(this.getDateDeNaissance()) &&
					c.getTypeClient().equals(this.getTypeClient())){
					return true;
			}
			else{
				return false;
			}
		}
	}
	
	public int hashCode(){
		return this.getDateDeNaissance().hashCode() +
				this.getNom().hashCode() +
				this.getPrenom().hashCode() +
				this.getTypeClient().hashCode();
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(TypeClient typeClient) {
		this.typeClient = typeClient;
	} 
	
	@Override
	public String toString(){
		String result = "Client de prénom : " + this.getPrenom() +
				" de nom: " + this.getNom() +
				" de date de naissance : " + this.getDateDeNaissance().toString() +
				" et de type de client : " + this.getTypeClient().getTypeClient();
		
		return result;
	}
}
