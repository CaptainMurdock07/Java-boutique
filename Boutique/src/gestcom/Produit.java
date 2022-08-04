package gestcom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produit {
	private int ref_produit;
	private String nom_produit;
	private double prix_unitaire;
	public Produit(String ref) throws ClassNotFoundException, SQLException {
		int nref;
		try {
			int nref = Integer.parseInt(ref);
			this.ref_produit = ref_produit;
			this.nom_produit = nom_produit;
			this.prix_unitaire = prix_unitaire;
		} catch	
		ResultSet rs = DB.getDB().select("select * from produits where ref_produit = " + nref);
		if (rs.next()) {
			prix_unitaire = rs.getDouble("prix_unitaire");
			nom_produit = rs.getString("nom_produit");
		}
	}
	public int getRef_produit() {
		return ref_produit;
	}
	public void setRef_produit(int ref_produit) {
		this.ref_produit = ref_produit;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public double getPrix_unitaire() {
		return prix_unitaire;
	}
	public void setPrix_unitaire(double prix_unitaire) {
		this.prix_unitaire = prix_unitaire;
	}
	public static ArrayList <String> lister(String filtre) throws ClassNotFoundException, SQLException {
		ResultSet rs = DB.getDB().select("select * from produits where nom_produit like '%" + filtre + "%'");
		ArrayList <String> liste = new ArrayList <String>();
		while (rs.next()) {
			liste.add(rs.getInt("ref_produit") + " / "  + rs.getSring("nom_produit");
		}
		return paniers;
	}
}
