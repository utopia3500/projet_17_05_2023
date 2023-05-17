package main.java.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

import main.java.model.Classable;
import main.java.model.Client;
import main.java.model.Commande;
import main.java.model.Fournisseur;
import main.java.model.Personne;
import main.java.model.TypeClient;
import main.java.model.Voiture;
import main.java.model.VoitureComparator;

public class Program {

	public static void main(String[] args) {
		
		//test1();
		/*try {
			test2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*try {
			testClone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//testEqualsClients();
		
		//Client client = new Client("Gabriel", "Fauré", LocalDate.of(1845, 5, 12), TypeClient.ADMINISTRATION);
		//infoClasse(client);
		//System.out.println(client);
		//exempleDeTri();
		trierLesVoituresParPuissance();
	}
	
	public static void infoClasse(Object o){
		Class c;  
	    c=o.getClass();  
	    System.out.println("nom de la classe : " + c.getName());  
	    System.out.println("elle est dans le package : " +   
	                    c.getPackage().getName());  
	    System.out.println("elle hérite de la classe  : " +   
	                    c.getSuperclass().getName());  
	    System.out.println("elle possède les champs : ");  
	    for (int i=0;i<c.getFields().length;i++)  
	    {  
	         System.out.print("\t" + c.getFields()[i].getName());  
	         System.out.println(" de type :" +   
	                    c.getFields()[i].getType().getName());  
	    }  
	    System.out.println("elle possède les méthodes : ");  
	    for (int i=0;i<c.getMethods().length;i++)  
	    {  
	         System.out.print("\t" + c.getMethods()[i].getName());  
	         System.out.print(" qui attend comme paramètre (");  
	         for (int j=0;j<c.getMethods()[i]  
	                         .getParameterTypes()  
	                         .length;j++)  
	         {  
	             System.out.print(c.getMethods()[i]  
	                               .getParameterTypes()[j]+  
	                             " ");  
	         }  
	         System.out.println(")");  
	    }  
	}
	
	public static void testType(){
		Object o = new Object();
		Personne p = new Personne("Didier", "Durand", LocalDate.of(1970, 11, 23));
		Client c = new Client("Eric", "Dupond", LocalDate.of(1962, 5, 28), TypeClient.ADMINISTRATION);
		Fournisseur f = new Fournisseur("Stéphane", "André", LocalDate.of(1980, 4, 30));
		
		// o=f;  affectation autorisée
		// p=f;  affectation autorisée
		// c=f;  affectation impossible
		
		// o=c; affectation autorisée
		// p=c; affectation autorisée
		// f=c; affectation impossible
		
		// o=c; affectation autorisée
		// c=p; affectation impossible
		// f=p; affectation impossible
		
		// p=o; affectation impossible
		// f=o; affectation impossible
		// c=o; affectation impossible
		
		// o=f; affectation autorisée
		// p=f; affectation autorisée
		// c=f; affectation impossible
		
		// o=p; affectation autorisée
		// c=p; affectation impossible
		// f=p; affectation impossible
		
		// p=o; affectation impossible
		// f=o; affectation impossible
		// c=o; affectation impossible
				
				
	}
	
	public static void testType2(){
		Object o = new Object();
		Personne p = new Personne("Jules", "Ferry", LocalDate.of(1890, 12, 3));
		Client c = new Client("Christophe", "André", LocalDate.of(1975, 5, 28), TypeClient.ENTREPRISE);
		Fournisseur f = new Fournisseur("Olié", "Jean Pierre", LocalDate.of(1955, 3, 12));
		
		essai2(o);  // fonctionne
		essai2(p);  // fonctionne
		essai2(f);	// fonctionne
		essai2(c);	// fonctionne
	}
	
	public static void essai3(Object obj){
		Object o;
		Personne p;
		Client c;
		Fournisseur f;
		
		o = obj;
		if (obj instanceof Personne){
			p = (Personne)obj;
		}
		if (obj instanceof Client){
			c = (Client)obj;
		}
		if (obj instanceof Fournisseur){
			f = (Fournisseur)obj;
		}
		
	}
	
	public static void testClone() throws CloneNotSupportedException{
		Client c = new Client("ENI","", LocalDate.of(1981,05,15), TypeClient.ENTREPRISE);  
		
		Commande cmd1, cmd2;
		cmd1 = new Commande();
		cmd1.setLeClient(c);
		
		System.out.println("hashCode de la commande : " +  cmd1.hashCode());  
		System.out.println("hashCode du Client : " + cmd1.getLeClient().hashCode());  
		System.out.println("hashCode des lignes : " +  cmd1.getLesLignes().hashCode());
		
		cmd2=(Commande)cmd1.clone();  
	    System.out.println("hashCode de la copie  : " + cmd2.hashCode());  
	    System.out.println("hashCode du Client de la copie: " + cmd2.getLeClient().hashCode());  
	    System.out.println("hashCode des lignes de la copie: "+  cmd2.getLesLignes().hashCode());  
	}
	
	public static void testEqualsClients(){
		Client c1,c2;  
	    c1=new Client("ENI", "", LocalDate.of(1981,05,15), TypeClient.ENTREPRISE);  
	    c2=new Client("ENI", "", LocalDate.of(1981,05,15), TypeClient.ENTREPRISE);  
	    
	    if (c1.equals(c2))  
	    {  
	        System.out.println("les deux clients sont identiques"); 
	    }  
	    else  
	    {  
	         System.out.println("les deux clients sont différents"); 
	    }  
	}
	
	public static void essai4(Object obj){
		Object o=obj; 
		// ne fonctionne pas avec Java 1.8
		/*if (obj instanceof Personne p) 
		{ 
		       
		}  
		if (obj instanceof Client c) 
		{  
		       
		}  
		if (obj instanceof Fournisseur f)  
		{  
		        
		}  */
	}
	
	public static void essai2(Object obj)  
	{  
	   Object o;  
	   Personne p;  
	   Client c;  
	   Fournisseur f;  
	  
	   // o=obj;   // fonctionne           
	   // p=obj;	// ne fonctionne pas              
	   // c=obj;   // ne fonctionne pas  
	   // f=obj;   // ne fonctionne pas  
	} 
	
	public static void test2() throws InterruptedException{
		double total;
		double reste;
		double pourcentage;
		
		for (int j=0; j < 1000; j++){
			creationTableau();
			total = Runtime.getRuntime().totalMemory();
			reste = Runtime.getRuntime().freeMemory();
			pourcentage=100-(reste/total)*100;  
			System.out.println("création du " + j + "ième " +  
					" tableau mémoire pleine à : " + pourcentage + "%" );  
			// une petite pause pour pouvoir lire les messages  
			Thread.sleep(1000); 
		}
	}
	
	public static void creationTableau(){
		Personne[] tablo;  
	    tablo=new Personne[1000];  
	    for (int i=0;i<1000;i++)  
	    {  
	         tablo[i]=new Personne("Dupont", 
	                                  "albert", 
	                                  LocalDate.of(1956,12,13));  
	    }  
	}
	
	public static void test1(){
		Personne pers1 = new Personne("Gabriel", "Fauré", LocalDate.parse("1845-05-12"));
		
		pers1.afficher();
		
		pers1.afficher(false);
		
		pers1.afficher("vert","bleu","rouge"); 
		
		pers1.afficher(null);
		
		
		
		Personne pers2 = new Personne("Serguei", "Rachmaninov", LocalDate.of(1873, 4, 1));
		pers2.afficher();
		
		Personne[] persTab = new Personne[4];
		persTab[0] = new Client("Maurice", "Ravel", LocalDate.of(1875, 3, 7), TypeClient.ADMINISTRATION);
		persTab[1] = new Fournisseur("Ludwig van", "Beethoven", LocalDate.of(1770, 12, 15));
		persTab[2] = new Client("Alexander", "Scriabin", LocalDate.of(1871, 12, 25), TypeClient.ENTREPRISE);
		persTab[3] = new Personne("Ernset", "Chausson", LocalDate.of(1855, 1, 20));
		
		System.out.println("************************************");
		
		for (Personne pers : persTab){
			pers.afficher(false);
		}
		
		System.out.println("*************************************");
		
		Client cl1 = new Client("Arthur", "Dupond", LocalDate.of(1968, 11, 23), TypeClient.PARTICULIER);
		

	}
	
	public static Classable[] tri(Classable[] tablo){
		int i,j;  
	    Classable c;  
	    Classable[] tabloTri;  
	    tabloTri = Arrays.copyOf(tablo, tablo.length);  
	    for (i=0;i< tabloTri.length;i++)  
	    {  
	       for( j = i + 1; j<tabloTri.length;j++)  
	       {  
	           if (tabloTri[j].compare(tabloTri[i])== 
	                                   Classable.INFERIEUR)  
	           {  
	               c = tabloTri[j];  
	               tabloTri[j] = tabloTri[i];  
	               tabloTri[i] = c;  
	           }  
	           else if (tabloTri[j].compare(tabloTri[i])== 
	                                   Classable.ERREUR)  
	           {  
	                return null;  
	           }  
	       }  
	    }  
	    return tabloTri;  
	}
	
	public static void exempleDeTri(){
		Personne[] tableauNonTrie = new Personne[5];  
		tableauNonTrie[0] = new Personne("toto2", "prenom2", LocalDate.of(1922,2,15));  
		tableauNonTrie[1] = new Personne("toto1", "prenom1", LocalDate.of(1911,1,15));  
		tableauNonTrie[2] = new Personne("toto5", "prenom5", LocalDate.of(1955,05,15));  
		tableauNonTrie[3] = new Personne("toto3", "prenom3", LocalDate.of(1933,03,15));  
		tableauNonTrie[4] = new Personne("toto4", "prenom4",LocalDate.of(1944,04,15));  
		   
		Personne[] tableauTrie;  
		tableauTrie=(Personne[])tri(tableauNonTrie);  
		for (int i=0;i<tableauTrie.length;i++)  
		{  
		    System.out.println(tableauTrie[i]);  
		}  
	}
	
	public static void trierLesVoituresParPuissance(){
		List<Voiture> list = new ArrayList<Voiture>();
		
		list.add(new Voiture("123456", "Mercedes Benz", "modele S500", 500));
		list.add(new Voiture("654321", "Peugeot", "modele 126", 100));
		list.add(new Voiture("123654", "Renault", "Picasso", 150));
		
		List<Voiture> listTriee = new ArrayList<Voiture>();
		
		for (Voiture v : list){
			listTriee.add(v);
		}
		
		VoitureComparator vc = new VoitureComparator();
		
		Collections.sort(listTriee, vc);
		
		for (Voiture v : listTriee){
			System.out.println(v);
		}
	}

}
