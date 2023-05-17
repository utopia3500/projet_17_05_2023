package main.java.model;

import java.time.LocalDate;
import java.util.Random;

public class Personne implements Classable{
	private String prenom;
	private String nom;
	private LocalDate dateDeNaissance;
	private int numero;
	private static int compteur;
	
	static{
		Random rd = new Random();
		compteur = rd.nextInt(1000);
	}
	
	public Personne(String prenom, String nom, LocalDate dateDeNaissance) {
		this.prenom = prenom.toLowerCase();
		this.nom = nom.toUpperCase();
		this.dateDeNaissance = dateDeNaissance;
		this.numero = ++compteur;
	}
	
	public int calculerAge(){
		if (dateDeNaissance != null){
			return this.dateDeNaissance.until(LocalDate.now()).getYears();	
		}
		
		return 0;
	}
	
	public void afficher(){
		
		System.out.println("--------------" + this.getClass().getName() + "--------------");
		System.out.println("prenom : " + prenom);
		System.out.println("nom : " + nom);
		System.out.println("âge : " + calculerAge());
		System.out.println("numéro : " + numero);
		System.out.println();
	}
	
	public void afficher(boolean francais)  
	{  
	   if (francais)  
	   {  
		   System.out.println("--------------" + this.getClass().getName() + "--------------");
	       System.out.println("nom : " + nom);  
	       System.out.println("prénom : " + prenom);  
	       System.out.println("âge : " + calculerAge());  
	       System.out.println("numéro : " + numero);
	       System.out.println();
	   }  
	   else  
	   {  
		   System.out.println("--------------" + this.getClass().getName() + "--------------");
	       System.out.println("name : " + nom);  
	       System.out.println("first name : " + prenom);  
	       System.out.println("age : " + calculerAge());  
	       System.out.println("numéro : " + numero);
	       System.out.println();
	   }  
	} 
	
	public void afficher(String ...couleurs){
		{  
			if (couleurs==null)  
		    {  
				System.out.println("pas de couleur");  
		        return;  
		    }  
		    switch (couleurs.length)  
		    {  
		    	   case 0:
		    		   System.out.println("pas de couleur"); 
		    		   break;
		           case 1:  
		               System.out.println("une couleur");  
		               break;  
		           case 2:  
		               System.out.println("deux couleurs");  
		               break;  
		           case 3:  
		               System.out.println("trois couleurs");  
		               break;  
		           default :  
		               System.out.println("plus de trois couleurs");  
		    }  
		}  
	}
	
	protected void finalize() throws Throwable{
		System.out.println("appelle finalize");
		System.out.print("\u2020");  
        super.finalize();  
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom.toLowerCase();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom.toUpperCase();
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Personne [prenom=" + prenom + ", nom=" + nom + ", dateDeNaissance=" + dateDeNaissance + "]";
	}

	@Override
	public int compare(Object o) {
		Personne p;  
	    if (o instanceof Personne)  
	    {  
	        p=(Personne)o;  
	    }  
	    else  
	    {  
	        return Classable.ERREUR;  
	    }  
	    if (getPrenom().compareTo(p.getPrenom())<0)  
	    {  
	        return Classable.INFERIEUR;  
	    }  
	    if (getPrenom().compareTo(p.getPrenom())>0)  
	    {  
	        return Classable.SUPERIEUR;  
	    }  
	    return Classable.EGAL; 
	}
	
	
}
