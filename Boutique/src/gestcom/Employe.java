package gestcom;

import java.util.ArrayList;

public class Employe {
	int no_employe;
	String nom;
	String prenom;
	String titre; String psswrd;
	
	public Employe(int no_employe, String nom, String prenom, String titre, String psswrd) {
		super();
		this.no_employe = no_employe;
		this.nom = nom;
		this.prenom = prenom;
		this.titre = titre;
		this.psswrd = psswrd;
	}

	public int getNo_employe() {
		return no_employe;
	}

	public void setNo_employe(int no_employe) {
		this.no_employe = no_employe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getPsswrd() {
		return psswrd;
	}

	public void setPsswrd(String psswrd) {
		this.psswrd = psswrd;
	}

	/*public static int login(String nom, String psswrd) {
		
	}
	static ArrayList <String> chercher(String term) {
		
	}
	/*static array String chercher(String term) {
		
	}*/
	static void ValiderCommande (String no_employe) {
		
	}
	
}
