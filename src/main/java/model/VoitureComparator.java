package main.java.model;

import java.util.Comparator;

public class VoitureComparator implements Comparator<Voiture>{
	
	public int compare(Voiture left, Voiture right){
		if (right.getPuissance() > left.getPuissance()){
			return -1;
		}
		else if (right.getPuissance() < left.getPuissance()){
			return 1;
		}
		else{
			return 0;
		}
	}
}
