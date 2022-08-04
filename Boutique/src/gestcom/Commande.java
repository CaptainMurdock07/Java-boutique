package gestcom;

import java.util.Date;
import java.util.List;

public class Commande extends Panier {
	
	public int ref_client;

	public int getRef_client() {
		return ref_client;
	}

	public void setRef_client(int ref_client) {
		this.ref_client = ref_client;
	}
	/*static array String chercher(String term) {
	
	}
	static void ValiderCommande (String client) {
		
	}*/

	public Commande(int ref_commande, int ref_client, int ref_employe, Date date_commande, double prix_unitaire,
			List<Detail_commande> lignes_commande) {
		super(ref_commande, ref_client, ref_employe, date_commande, prix_unitaire, lignes_commande);
		// TODO Auto-generated constructor stub
	}

}
