package main.java.model;

public abstract class EtreVivant {
	private double taille;
	private double poids;
	
	public EtreVivant(double taille, double poids) {
		this.taille = taille;
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	protected abstract void seDeplacer();
}
