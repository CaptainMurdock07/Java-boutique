package gestcom;

import java.util.ArrayList;

public class Societe {
	public String code_client;
	public String societe;
	public String adresse;
	public String code_postal;
	public String ville;
	public String pays;
	public String telephone;
	
	public Societe(String code_client, String societe, String adresse, String code_postal, String ville, String pays,
			String telephone) {
		super();
		this.code_client = code_client;
		this.societe = societe;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
		this.telephone = telephone;
	}
	
	public String getCode_client() {
		return code_client;
	}

	public void setCode_client(String code_client) {
		this.code_client = code_client;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/*static ArrayList <String> chercher(String term) {
		
	}*/
	static void ValiderCommande (String code_client) {
		
	}
}
