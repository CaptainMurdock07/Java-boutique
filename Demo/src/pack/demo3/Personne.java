package pack.demo3;

public class Personne implements Locataire {
	public String Nom;
	
	public Personne(String nom) {
		super();
		Nom = nom;
	}

	@Override
	public boolean payerLoyer() {
		// TODO Auto-generated method stub
		System.out.println("Madame et Monsieur " + Nom + " envoient un cheque");
		return false;
	}

}
