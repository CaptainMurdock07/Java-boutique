package com.formationjava.tpjdbc.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.formationjava.tpjdbc.bo.Employe;
import com.formationjava.tpjdbc.dal.EmployeDAO;

public class EmployeDAOImpl implements EmployeDAO {
	
	private static String SQL_SELECT_ALL = "SELECT * FROM EMPLOYES";
	private static String SQL_GET_REF_BY_NAME = "SELECT no_employe FROM EMPLOYES WHERE nom=?";

	@Override
	public List<Employe> getAll() {
		List<Employe> liste = new ArrayList<>();
		
		Connection cx = null;
		
		try
		{
			cx = ConnexionManager.getInstance().getConnection();
			PreparedStatement stmt = cx.prepareStatement(SQL_SELECT_ALL);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Employe e = new Employe(rs.getString("NOM"));
				liste.add(e);
			}
			ConnexionManager.getInstance().closeConnection(cx);
		}
		catch(Exception e)
		{
			System.out.println("EMPLOYE DAO IMPL - GET ALL - ERROR : "+e.getMessage());
			ConnexionManager.getInstance().closeConnection(cx);
		}
		
		return liste;
	}


	@Override
	public int getReference(String nom) {
		int reference_employe = -1;
		
        Connection cx = null;
		
		try
		{
			cx = ConnexionManager.getInstance().getConnection();
			PreparedStatement stmt = cx.prepareStatement(SQL_GET_REF_BY_NAME);
			stmt.setString(1, nom);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next())
			{
				reference_employe = rs.getInt("NO_EMPLOYE");
			}
			ConnexionManager.getInstance().closeConnection(cx);
		}
		catch(Exception e)
		{
			System.out.println("EMPLOYE DAO IMPL - GET REF BY NAME - ERROR : "+e.getMessage());
			ConnexionManager.getInstance().closeConnection(cx);
		}
		return reference_employe;
	}

}
