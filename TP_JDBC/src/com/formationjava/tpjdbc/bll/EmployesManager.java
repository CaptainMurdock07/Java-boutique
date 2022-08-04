package com.formationjava.tpjdbc.bll;

import java.util.List;

import com.formationjava.tpjdbc.bo.Employe;
import com.formationjava.tpjdbc.dal.DAOFactory;
import com.formationjava.tpjdbc.dal.EmployeDAO;

public class EmployesManager {
	private static EmployesManager instance;

	public static EmployesManager getInstance()
	{
		if(instance == null)
		{
			instance = new EmployesManager();
		}
		return instance;
	}

	public List<Employe> afficherListe()
	{
		EmployeDAO employe_dao = DAOFactory.getInstance().getEmployeDAO();
		
		List<Employe> liste = employe_dao.getAll();
		
		return liste; 
	}
}
