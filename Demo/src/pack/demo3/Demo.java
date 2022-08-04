package pack.demo3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne loc1 = new Personne("toto");
		Societe loc2 = new Societe("Baya", "123456789");
		Agence agence = new Agence("Orpi");
		agence.percevoirLoyers(loc1);
		agence.percevoirLoyers(loc2);
	}

}
