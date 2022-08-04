package com.formationjava.tpjdbc.bo;

public class Detail {
    Produit produit;
    int quantite;
     
	public Detail(Produit produit, int quantite) {
		super();
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
}
