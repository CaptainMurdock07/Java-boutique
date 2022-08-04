package pack.demo5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		double z = 0;
		Scanner clavier = null;
		System.out.println("Entrer un nombre entier positif : ");
		while (a < 0) {
			try {
				clavier = new Scanner (System.in);
				a = clavier.nextInt();
				//clavier.close();
				if (a < 0) a = -a;
				z = Calcul.calculCoeffZ (a);
			} catch (InputMismatchException e) {
				System.out.println("Saisie invalide, entrer un nombre entier positif : ");
			} catch (ArithmeticException e) {
				System.out.println("a doit etre different de 2. Entrer un nombre entier positif : ");
				a = -1;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				a = -1;
			} finally {
				
			}
		}
		System.out.println("Coefficient z = " + z);
	}

}
