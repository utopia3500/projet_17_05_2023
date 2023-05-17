package main.java.model;

public class Voiture {
	private String immatriculation;  
	private String marque;  
	private String modele;  
	private int puissance;
	  
	public Voiture(String immatriculation, String marque, String modele, int puissance) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Voiture [immatriculation=" + immatriculation + ", marque=" + marque + ", modele=" + modele
				+ ", puissance=" + puissance + "]";
	}  
	  
	  
}
