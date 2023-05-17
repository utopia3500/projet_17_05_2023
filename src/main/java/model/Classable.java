package main.java.model;

public interface Classable {
	/**  
	 * cette m�thode pourra �tre appel�e pour comparer l'instance 
	 * courante avec celle re�ue en param�tre  
	 * la m�thode retourne un entier dont la valeur d�pend  
	 * des r�gles suivantes  
	 * 1 si l'instance courante est sup�rieure � celle re�ue  
	 * en param�tre  
	 * 0 si les deux instances sont �gales  
	 * -1 si l'instance courante est inf�rieure � celle re�ue   
	 * en param�tre  
	 * -99 si la comparaison est impossible  
	 */  
	 int compare(Object o);  
	 default boolean isInferieur(Object o)  
     {  
         return false;  
     }  
     default boolean isSuperieur(Object o)  
     {  
         return false;  
     }  
	 public static final int INFERIEUR=-1;    
	 public static final int EGAL=0;   
	 public static final int SUPERIEUR=1;    
	 public static final int ERREUR=-99; 
}
