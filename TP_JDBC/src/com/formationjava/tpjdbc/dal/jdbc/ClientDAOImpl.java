package com.formationjava.tpjdbc.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.formationjava.tpjdbc.bo.Client;
import com.formationjava.tpjdbc.bo.Employe;
import com.formationjava.tpjdbc.dal.ClientDAO;

public class ClientDAOImpl implements ClientDAO {
	private static String SQL_SELECT_ALL = "SELECT * FROM CLIENTS";

	@Override
	public List<Client> getAll() {
		List<Client> liste = new ArrayList<>();
	
	    Connection cx = null;
	
	    try
   	    {
		   cx = ConnexionManager.getInstance().getConnection();
	  	   PreparedStatement stmt = cx.prepareStatement(SQL_SELECT_ALL);
		
		   ResultSet rs = stmt.executeQuery();
		
		   while(rs.next())
		   {
			   Client e = new Client(rs.getString("SOCIETE"));
			   liste.add(e);
		   }
		   ConnexionManager.getInstance().closeConnection(cx);
	    }
    	catch(Exception e)
	    {
		   System.out.println("CLIENT DAO IMPL - GET ALL - ERROR : "+e.getMessage());
		   ConnexionManager.getInstance().closeConnection(cx);
	    }
	
	    return liste;
	}

}
