package com.formationjava.tpjdbc.bll;

import java.util.List;

import com.formationjava.tpjdbc.bo.Produit;
import com.formationjava.tpjdbc.dal.DAOFactory;

public class ProduitsManager {
	private static ProduitsManager instance;

	public static ProduitsManager getInstance()
	{
		if(instance == null)
		{
			instance = new ProduitsManager();
		}
		return instance;
	}
	
	
	public List<Produit> getAll()
	{
		return DAOFactory.getInstance().getProduitDAO().getAll();
	}
	
	public boolean findReference(int ref)
	{
		System.out.println("ProduitsMAnager - find reference: "+ref);
		Produit p = null;
		p = DAOFactory.getInstance().getProduitDAO().getByReference(ref);
		return p != null;
	}

}
