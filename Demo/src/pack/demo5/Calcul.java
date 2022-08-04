package pack.demo5;

public class Calcul {
	public static double calculCoeffZ (int x) throws Exception {
		if (x >= 10) throw new Exception ("a ne doit pas etre superieur a 10 ! Entrer un entier positif : ");
		return (x+5) / (x-2);
	}
}
