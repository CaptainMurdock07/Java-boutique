package pack.demo3;

public class Societe implements Locataire {
	public String raisonSociale;
	public String siret;
	
	public Societe(String raisonSociale, String siret) {
		super();
		this.raisonSociale = raisonSociale;
		this.siret = siret;
	}

	@Override
	public boolean payerLoyer() {
		// TODO Auto-generated method stub
		System.out.println("La societe " + raisonSociale + " fait un virement");
		return false;
	}

}
