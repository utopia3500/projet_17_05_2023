package main.java.model;


public class Commande implements Cloneable{
	private Client leClient;
	private LignesDeCommande lesLignes;
	
	public Commande() {
		super();
		lesLignes = new LignesDeCommande();
	}
	
	public Object clone() throws CloneNotSupportedException{
		Commande cmd;
		
		cmd = (Commande)super.clone();
		cmd.setLesLignes((LignesDeCommande)(this.getLesLignes().clone()));
		return cmd;
	}

	public Client getLeClient() {
		return leClient;
	}

	public void setLeClient(Client leClient) {
		this.leClient = leClient;
	}

	public LignesDeCommande getLesLignes() {
		return lesLignes;
	}

	public void setLesLignes(LignesDeCommande lesLignes) {
		this.lesLignes = lesLignes;
	}
	
	
	
	
	
	
	
}
