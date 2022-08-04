package pack.serial;

import java.io.Serializable;

public class Voiture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String marque;
	private String couleur;
	private Moteur moteur;
	public Voiture(String marque, String couleur, Moteur moteur) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.moteur = moteur;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Moteur getMoteur() {
		return moteur;
	}
	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
}
