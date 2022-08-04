package com.formationjava.tpjdbc.bll;

import java.util.List;

import com.formationjava.tpjdbc.bo.Client;
import com.formationjava.tpjdbc.dal.ClientDAO;
import com.formationjava.tpjdbc.dal.DAOFactory;

public class ClientsManager {
	private static ClientsManager instance;

	public static ClientsManager getInstance()
	{
		if(instance == null)
		{
			instance = new ClientsManager();
		}
		return instance;
	}

	public List<Client> afficherListe()
	{
        ClientDAO client_dao = DAOFactory.getInstance().getClientDAO();
		
		List<Client> liste = client_dao.getAll();
		
		return liste; 
	}
}
