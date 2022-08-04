package com.formationjava.tpjdbc.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionManager {
	private static ConnexionManager instance;
	private static String jdbcdriver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String uid = "la300";
	private static String passwd = "secret";

	public static ConnexionManager getInstance()
	{
		if(instance == null)
		{
			instance = new ConnexionManager();
		}
		return instance;
	}
	
	private ConnexionManager()
	{
		try
		{
		   Class.forName(jdbcdriver);
		}
		catch(Exception e)
		{
			System.out.println("DAL - ConnextionManager - Error : "+e.getMessage());
		}
	}
	
	public Connection getConnection()
	{
		try
		{
           Connection cx = DriverManager.getConnection(url,uid,passwd);
           return cx;
		}
		catch(SQLException e)
		{
		  System.out.println("DAL - ConnextionManager - Open Connection Error : "+e.getMessage());	
		  return null;
		}
	}
	
	public void closeConnection(Connection cx)
	{
		try
		{
		   if(cx == null) cx.close();
		}
		catch(SQLException e)
		{
		   System.out.println("DAL - ConnextionManager - Open Connection Error : "+e.getMessage());	
		}
	}
}
