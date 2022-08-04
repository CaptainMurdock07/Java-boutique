package gestcom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Panier {
	private int ref_commande;
	private int ref_client;
	private int ref_employe;
	private Date date_commande;
	private double prix_unitaire;
	private List <Detail_commande> lignes_commande = new ArrayList <Detail_commande>();
	public Panier(int ref_commande, int ref_client, int ref_employe, Date date_commande, double prix_unitaire,
			List<Detail_commande> lignes_commande) {
		super();
		this.ref_commande = ref_commande;
		this.ref_client = ref_client;
		this.ref_employe = ref_employe;
		this.date_commande = date_commande;
		this.prix_unitaire = prix_unitaire;
		this.lignes_commande = lignes_commande;
	}
	public int getRef_commande() {
		return ref_commande;
	}
	public void setRef_commande(int ref_commande) {
		this.ref_commande = ref_commande;
	}
	public int getRef_client() {
		return ref_client;
	}
	public void setRef_client(int ref_client) {
		this.ref_client = ref_client;
	}
	public int getRef_employe() {
		return ref_employe;
	}
	public void setRef_employe(int ref_employe) {
		this.ref_employe = ref_employe;
	}
	public Date getD() {
		return date_commande;
	}
	public void setD(Date date_commande) {
		this.date_commande = date_commande;
	}
	public double getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public List<Detail_commande> getLignes_commande() {
		return lignes_commande;
	}
	public void setLignes_commande(List<Detail_commande> lignes_commande) {
		this.lignes_commande = lignes_commande;
	}
	static ArrayList <String> consulter() {
		
	}
	
}
