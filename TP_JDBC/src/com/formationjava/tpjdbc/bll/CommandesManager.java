package com.formationjava.tpjdbc.bll;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.formationjava.tpjdbc.bo.Commande;
import com.formationjava.tpjdbc.bo.Panier;
import com.formationjava.tpjdbc.dal.DAOFactory;

public class CommandesManager {
	private static CommandesManager instance;
	
	private List<Commande> commandes= new ArrayList<>();

	public static CommandesManager getInstance()
	{
		if(instance == null)
		{
			instance = new CommandesManager();
		}
		return instance;
	}
	
	public boolean creerCommande(Panier panier, String employe_login, int ref_client)
	{
		int reference_employe = DAOFactory.getInstance().getEmployeDAO().getReference(employe_login);
		panier.setRefEmploye(reference_employe);
		panier.setDate(new Timestamp(System.currentTimeMillis()));
		
		Commande commande = new Commande();
		
		commande.setPanier(panier);
		commande.setRef_client(ref_client);
	    commandes.add(commande);
	    
	    // TODO: sauvegarder la commande dans la base de donnée
	    
	    return false;
	}
	
	public List<Commande> getCommandes()
	{
		return this.commandes;
	}
}
