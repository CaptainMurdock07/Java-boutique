package pack.demo2;

public abstract class Vehicule {
	private int nbrPassager;
	protected int nbrKlm;
	public Vehicule(int nbrPassager, int nbrKlm) {
		super();
		this.nbrPassager = nbrPassager;
		this.nbrKlm = nbrKlm;
	}
	public int getNbrPassager() {
		return nbrPassager;
	}
	public void setNbrPassager(int nbrPassager) {
		this.nbrPassager = nbrPassager;
	}
	public int getNbrKlm() {
		return nbrKlm;
	}
	public void setNbrKlm(int nbrKlm) {
		this.nbrKlm = nbrKlm;
	}
	public abstract void demarrer();
	public abstract void deplacer(int km);
	public abstract void stopper();
	public void transporter(int nbr, int km) {
		this.nbrPassager = nbr;
		this.demarrer();
		this.deplacer(km);
		this.stopper();
	}
}
