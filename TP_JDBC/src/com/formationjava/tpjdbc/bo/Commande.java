package com.formationjava.tpjdbc.bo;

import java.util.ListIterator;

public class Commande {
    int           ref_client;
    Panier        panier;
    
	public int getRef_client() {
		return ref_client;
	}
	public void setRef_client(int ref_client) {
		this.ref_client = ref_client;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = new Panier(panier);
	}
    
	
	
}
