package com.formationjava.tpjdbc.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.formationjava.tpjdbc.bo.Employe;
import com.formationjava.tpjdbc.bo.Produit;
import com.formationjava.tpjdbc.dal.ProduitDAO;

public class ProduitDAOImpl implements ProduitDAO {
	private static String SQL_SELECT_ALL = "SELECT * FROM PRODUITS";
	private static String SQL_SELECT_BY_REF = "SELECT * FROM PRODUITS WHERE REF_PRODUIT=?";

	@Override
	public List<Produit> getAll() {
		List<Produit> liste = new ArrayList<>();
		
		Connection cx = null;
		
		try
		{
			cx = ConnexionManager.getInstance().getConnection();
			PreparedStatement stmt = cx.prepareStatement(SQL_SELECT_ALL);
			
			ResultSet rs = stmt.executeQuery();
			
			//System.out.println("creer lister produit");
			
			while(rs.next())
			{
				Produit p = new Produit(rs.getString("REF_PRODUIT"),
						                rs.getString("NOM_PRODUIT"),
						                rs.getFloat("PRIX_UNITAIRE"));
				liste.add(p);
			}

			ConnexionManager.getInstance().closeConnection(cx);	
		}
		catch(Exception e)
		{
			System.out.println("PRODUIT DAO IMPL - GET ALL - ERROR : "+e.getMessage());
			ConnexionManager.getInstance().closeConnection(cx);
			
		}
		
		return liste;
	}



	@Override
	public Produit getByReference(int ref) {

		Connection cx = null;
		Produit p = null;
		
		try
		{  
			cx = ConnexionManager.getInstance().getConnection();
			PreparedStatement stmt = cx.prepareStatement(SQL_SELECT_BY_REF);
			stmt.setInt(1, ref);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())
			{
				p = new Produit(rs.getString("REF_PRODUIT"),
						        rs.getString("NOM_PRODUIT"),
						        rs.getFloat("PRIX_UNITAIRE"));
			}
		}
		catch(Exception e)
		{
			System.out.println("PRODUIT DAO IMPL - GET BY REFERENCE - ERROR : "+e.getMessage());
		}
		
		return p;
	}


}
