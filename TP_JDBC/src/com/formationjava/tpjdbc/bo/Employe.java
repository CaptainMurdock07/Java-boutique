package com.formationjava.tpjdbc.bo;

public class Employe {
    String nom;
    String prenom;
    String password;
    
    public Employe(String nom)
    {
    	this.nom = nom;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
