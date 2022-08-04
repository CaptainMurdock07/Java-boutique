package pack.serial;

import java.io.Serializable;

public class Moteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int puissance;
	private String type;
	public Moteur(int puissance, String type) {
		super();
		this.puissance = puissance;
		this.type = type;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
