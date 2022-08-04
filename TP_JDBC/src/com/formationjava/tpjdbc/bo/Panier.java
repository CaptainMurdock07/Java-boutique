package com.formationjava.tpjdbc.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Panier {
    int           reference;
    ArrayList<Detail>  articles;
    int           ref_employe;
    Timestamp     date;
    
    public Panier() 
    {
        articles = new ArrayList<>();
    }
    
    public Panier(Panier p)
    {
    	System.out.println("cloner panier");
    	articles = new ArrayList<Detail>(p.getArticles());
    	reference = p.getReference();
    	ref_employe = p.getRefEmploye();
    	date = p.getDate(); 
    }
    
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public ArrayList<Detail> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Detail> articles) {
		this.articles = articles;
	}
	public int getRefEmploye() {
		return ref_employe;
	}
	public void setRefEmploye(int ref_employe) {
		this.ref_employe = ref_employe;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date_commande) {
		this.date = date_commande;
	}
	
	public void add(Detail detail)
	{
		this.articles.add(detail);
	}
}
