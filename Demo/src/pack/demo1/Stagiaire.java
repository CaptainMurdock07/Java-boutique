package pack.demo1;

public class Stagiaire extends Personne {
	private String cours;

	public Stagiaire(String nom, String cours) {
		super(nom);
		this.cours = cours;
	}
	public void afficher() {
		super.afficher();
		System.out.println("Mon cours : " + this.cours);
	}
	public boolean equals(Object o) {
		if (o instanceof Stagiaire) {
			Stagiaire s = (Stagiaire) o;
			if (s.cours.compareTo(this.cours)==0 && super.equals(this)) return true;
			else return false;
		}
		else {
			return false;
		}
	}
}
