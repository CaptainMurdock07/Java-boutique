package pack.demo1;

public class Personne {
	private String nom;

	public Personne(String nom) {
		
		this.nom = nom;
	}
	public void afficher() {
		System.out.println("Je m'appelle " + this.nom);
	}
	public boolean equals(Object o) {
		if (o instanceof Personne) {
			Personne p = (Personne) o;
			if (p.nom.compareTo(this.nom)==0) return true;
			else return false;
		}
		else {
			return false;
		}
	}
}
