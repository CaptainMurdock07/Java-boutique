package pack.demo2;

public class Bus extends Vehicule {

	public Bus(int nbrPassager, int nbrKlm) {
		super(nbrPassager, nbrKlm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void demarrer() {
		// TODO Auto-generated method stub
		System.out.println("Demarrer le bus");
	}

	@Override
	public void deplacer(int km) {
		// TODO Auto-generated method stub
		System.out.println("Le bus roule " + km + "kms");
	}

	@Override
	public void stopper() {
		// TODO Auto-generated method stub
		System.out.println("Le bus s'arrete");
	}
	
}
