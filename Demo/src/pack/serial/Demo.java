package pack.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Moteur m = new Moteur(1040, "Electrique");
		Voiture v = new Voiture("Tesla", "Rouge", m);
		FileOutputStream fileSortie = new FileOutputStream("C:\\Fichier_Demo\\voiture.txt");
		ObjectOutputStream oSortie = new ObjectOutputStream(fileSortie);
		oSortie.writeObject(v);
		oSortie.close();
		v = null;
		System.gc();
		FileInputStream fileEntree = new FileInputStream("C:\\Fichier_Demo\\voiture.txt");
		ObjectInputStream oEntree = new ObjectInputStream(fileEntree);
		Voiture v2 = (Voiture) oEntree.readObject();
		oEntree.close();
	}

}
