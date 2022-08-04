package pack.demo1;

public class Musicien extends Personne {
	private String instrument;

	public Musicien(String nom, String instrument) {
		super(nom);
		this.instrument = instrument;
	}
	public void afficher() {
		super.afficher();
		System.out.println("Mon instrument : " + this.instrument);
	}
}
