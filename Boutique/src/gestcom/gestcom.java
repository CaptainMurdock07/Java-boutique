package gestcom;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class gestcom {
	private static Employe employe = null;
	private static Scanner clavier;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//MD5.pwdEmployes();
		//DB.getDB().select("SELECT SOCIETE, PAYS FROM CLIENTS");
		//DB.getDB().select("SELECT NO_EMPLOYE, PRENOM FROM EMPLOYES");
		clavier = new Scanner(System.in);
		boolean quit = false;
		while (!quit) {
			if (employe == null) {
				try {
					quit = Login();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				System.out.println("[1] Liste des produits - [2] Ajouter un produit dans le panier");
				String menu = clavier.next();
				switch (menu) {
				case "q!" : 
					quit = true;
					break;
				case "1" :
					afficherProduits();
					break;
				case "2" :
					AjouterPanier();
					break;
				}
			}
		}
	}
	private static void afficherProduits() throws ClassNotFoundException, SQLException {
		System.out.println("Nom produit :");
		String filtre = clavier.next();
		ArrayList <String> liste = Produit.lister(filtre);
		Produit p = new Produit (ref);
		if (p.getRef_produit() > 0) {
			System.out.println("Quantite : ");
			int q = clavier.nextInt();
		}
	}
	private static void AjouterPanier() {
		
	}
}
