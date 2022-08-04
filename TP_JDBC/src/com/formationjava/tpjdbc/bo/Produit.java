package com.formationjava.tpjdbc.bo;

public class Produit {
	String reference;
    String nom;
    String description;
    float prix;
    
    public Produit(String reference, String nom, float prix)
    {
    	this.reference = reference;
    	this.nom = nom;
    	this.prix = prix;
    }
      
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
      
      
}
