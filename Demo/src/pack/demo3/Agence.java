package pack.demo3;

public class Agence {
	public String nom;
	
	public Agence(String nom) {
		super();
		this.nom = nom;
	}

	public boolean percevoirLoyers(Locataire loc) {
		//Locataire loc = app.obtenirLocataire();
		return loc.payerLoyer();
	}
}
