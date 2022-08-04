package com.formationjava.tpjdbc.dal;

import com.formationjava.tpjdbc.dal.jdbc.ClientDAOImpl;
import com.formationjava.tpjdbc.dal.jdbc.EmployeDAOImpl;
import com.formationjava.tpjdbc.dal.jdbc.ProduitDAOImpl;

public class DAOFactory {
	private static DAOFactory instance;

    public static DAOFactory getInstance()
    {
	    if(instance == null)
 	    {
		   instance = new DAOFactory();
	    }
 	    return instance;
    }
    
    private DAOFactory()
    {}
    
    public EmployeDAO getEmployeDAO()
    {
    	return new EmployeDAOImpl();
    }

    public ClientDAO getClientDAO()
    {
    	return new ClientDAOImpl();
    }
    
    public ProduitDAO getProduitDAO()
    {
    	return new ProduitDAOImpl();
    }
}
