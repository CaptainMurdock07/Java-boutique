package com.formationjava.tpjdbc.ihm;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.formationjava.tpjdbc.bll.ClientsManager;
import com.formationjava.tpjdbc.bll.CommandesManager;
import com.formationjava.tpjdbc.bll.EmployesManager;
import com.formationjava.tpjdbc.bll.LoginManager;
import com.formationjava.tpjdbc.bll.ProduitsManager;
import com.formationjava.tpjdbc.bo.Client;
import com.formationjava.tpjdbc.bo.Commande;
import com.formationjava.tpjdbc.bo.Detail;
import com.formationjava.tpjdbc.bo.Employe;
import com.formationjava.tpjdbc.bo.Panier;
import com.formationjava.tpjdbc.bo.Produit;
import com.formationjava.tpjdbc.dal.DAOFactory;

public class IHM {
	private static Panier  panier = new Panier();
	private static Scanner clavier = null;
	private static String  login = "";

	public static void main(String[] args) {
		String password = "";
		
		try
		{	
			do
			{
				try
				{
		           clavier = new Scanner(System.in);
		           System.out.println("login:");
		           login = clavier.nextLine();
		           System.out.println("password:");
		           password = clavier.nextLine();
				}
				catch(Exception e)
				{
					System.out.println("Error : "+e.getMessage());
					if(clavier != null) clavier.close();
				}
			}
			while(!LoginManager.getInstance().connect(login,password));
			
			System.out.println("connecté");
			
		    boolean exit = false;
		    
		    while(!exit)
		    {
		    	try
		    	{
					System.out.println("select action:");
					System.out.println("[0] passer commande  [1] liste employés [2] liste clients [3] commandes en cours [4] exit");
					
					int action = clavier.nextInt();
					
					switch(action) {
					    case 0: {
							System.out.println("... [0] ajouter article  [1] lister articles [2] panier [3] retour");
							
							int cmd_action = clavier.nextInt();
							
							switch(cmd_action) {
							    case 0: {
							    	System.out.println("reference:");
							    	
									int ref = clavier.nextInt();
									
									if(!ProduitsManager.getInstance().findReference(ref))
									{
										System.out.println("reference introuvable: "+ ref);
									}
									else
									{
								    	System.out.println("quantité:");
										int quantite = clavier.nextInt();
										
										ajouterArticle(ref, quantite);
									}
										
							    }break;
							    case 1: {
							    	System.out.println("**** LISTE PRODUITS ****");
							 	    List<Produit> produits = ProduitsManager.getInstance().getAll();	
							 	    
							 	    for(Iterator it = produits.iterator(); it.hasNext(); )
							 		{
							 			Produit produit = (Produit) it.next();
							 			System.out.println(produit.getReference()+" : "+produit.getNom()+" : "+produit.getPrix());
							 		}
							    }break;
							    case 2: 
						    	{
							    	 System.out.println("**** PANIER ****");
							    	 
                                     List<Detail> articles = panier.getArticles();
                                     
                                     for(ListIterator<Detail> it = articles.listIterator(); it.hasNext();)
                                     {
                                    	 int index = it.nextIndex();
                                    	 Detail detail = (Detail) it.next();
                                    	 String ref = detail.getProduit().getReference();
                                    	 String nom = detail.getProduit().getNom();
                                    	 float prix = detail.getQuantite() * detail.getProduit().getPrix();
                                    	 
                                    	 System.out.println("("+index+") "+ref+" : "+nom+"  ==> "+prix+" eur");
                                     }
							    	 
							    	 System.out.println("[0] retour  [1] valider [2] modifier quantité [3] supprimer article");
							    	 
							    	 int panier_action = clavier.nextInt();
							    	 
							    	 if(panier_action == 0)
							    	 {
							    		 break;
							    	 }
							    	 else if(panier_action==1)
							    	 {
							    		 System.out.println(" ==> valider panier");
							    		 
							    		 // TODO: saisir ref client
							    		 
							    		 int ref_client = 0;
							    		 
							    		 CommandesManager.getInstance().creerCommande(panier,login,ref_client);
							    	 }
							    	 else if(panier_action==2)
							    	 {
							    		 System.out.println(" ==> modifier quantité article");
							    		 System.out.println("article index:");
							    		 int index = clavier.nextInt();
							    		 
							    		 if(index <0 || index>=articles.size())
							    		 {
							    			 System.out.println("invalid index: "+index);
							    			 break;
							    		 }
							    		 
							    		 System.out.println("nouvelle quantité: ");
							    		 int nouvelle_quantite = clavier.nextInt();
							    		 Detail article = articles.get(index);
							    		 article.setQuantite(nouvelle_quantite);
							    	 }
							    	 else if(panier_action==3)
							    	 {
							    		 System.out.println(" ==> supprimer article");
							    		 System.out.println("article index:");
							    		 int index = clavier.nextInt();
							    		 
							    		 if(index <0 || index>=articles.size())
							    		 {
							    			 System.out.println("invalid index: "+index);
							    			 break;
							    		 }
							    		 
							    		 articles.remove(index);
							    		 System.out.println("article supprimé");
							    	 }
						    	} break;
							    case 3: exit = true; break;
							    default: break;
							}
				    	} break;
					    case 1: afficherListeEmployes(); break;
					    case 2: afficherListeClients(); break;
					    case 3:{
					    	System.out.println("**** COMMANDES EN COURS ****");
					    	List<Commande> commandes = CommandesManager.getInstance().getCommandes();
					    	
					    	for(ListIterator<Commande> it = commandes.listIterator(); it.hasNext();)
					    	{
					    		int index = it.nextIndex()+1;
					    		Commande commande = (Commande) it.next();
					    		System.out.println(" ---- Commande n°"+index+" ---- ");
					    		System.out.println("ref client: "+commande.getRef_client());
					    		for(ListIterator<Detail> articles_it = commande.getPanier().getArticles().listIterator(); articles_it.hasNext();)
					    		{
					    			int article_index = articles_it.nextIndex();
					    			Detail article = articles_it.next();
					    			Produit p = article.getProduit();
					    			System.out.println("("+article_index+") "+p.getReference()+" : "+p.getNom()+" ===> "+article.getQuantite()*p.getPrix());
					    		}
					    	}
					    	
	
					    }break;
					    case 4: exit = true; break;
					    default: break;
					}
		    	}
		    	catch(Exception e)
		    	{
					System.out.println("Error : "+e.getMessage());
					//if(clavier != null) clavier.close();
		    	}
		    }
		    
		    System.out.println("Thank you !");
			
			if(clavier != null) clavier.close();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			if(clavier != null) clavier.close();
		}
	}
	
	private static void afficherListeClients()
	{
		List<Client> clients = ClientsManager.getInstance().afficherListe();
		
		System.out.println("*** liste clients ***");
		
		for(Iterator it = clients.iterator(); it.hasNext(); )
		{
			Client client = (Client) it.next();
			System.out.println(client.getNom());
		}
	}
	
	private static void afficherListeEmployes()
	{
		List<Employe> employes = EmployesManager.getInstance().afficherListe();
		
		System.out.println("*** liste employes ***");
		
		for(Iterator it = employes.iterator(); it.hasNext(); )
		{
			Employe employe = (Employe) it.next();
			System.out.println(employe.getNom());
		}	
	}

	private static boolean ajouterArticle(int reference, int quantite)
	{
		System.out.println("COMANDES MANAGER - AJOUTER ARTICLE");
		System.out.println(" --> ref="+reference);
		System.out.println(" --> int="+quantite);
		
		float prix = 0.0f;
		
		Produit produit = null;
		produit=DAOFactory.getInstance().getProduitDAO().getByReference(reference);
		
		if(produit==null) return false;
		
		panier.add(new Detail(produit, quantite));
		
		return true;
	}
}
