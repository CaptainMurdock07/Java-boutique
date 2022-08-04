package com.formationjava.tpjdbc.bll;

public class LoginManager {
	private static LoginManager instance;

	public static LoginManager getInstance()
	{
		if(instance == null)
		{
			instance = new LoginManager();
		}
		return instance;
	}
	
	public boolean connect(String login, String password)
	{
		if(login != "" && password != "") return true;
		
		return false;
	}
}
