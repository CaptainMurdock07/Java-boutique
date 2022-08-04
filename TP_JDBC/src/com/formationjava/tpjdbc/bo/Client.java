package com.formationjava.tpjdbc.bo;

public class Client {
    private String nom;
    private String addresse;
    
    public Client(String nom)
    {
    	this.nom = nom;
    }
      
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
      
      
      
}
