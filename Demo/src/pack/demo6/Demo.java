package pack.demo6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c = '0';
		String str = null;
		FileReader entree = null;
		FileWriter sortie = null;
		try {
			/*entree = new FileReader("C:\\Fichier_Demo\\Fichier_Source.txt");
			BufferedReader in = new BufferedReader(entree);
			sortie = new FileWriter("C:\\Fichier_Demo\\Fichier_Dest.txt");
			BufferedWriter out = new BufferedWriter(sortie);*/
			RandomAccessFile fichier = new RandomAccessFile("C:\\Fichier_Demo\\Fichier_Source.txt", "rw");
			fichier.seek(4);
			while (fichier.getFilePointer() < fichier.length()) {
				System.out.println(fichier.readLine());
			}
			fichier.close();
			//while ((c = (char) entree.read()) != (char) -1) {
			/*while ((str = in.readLine()) != null) {
				//sortie.write(c);
				sortie.write(str + '\n');
			}*/
		} catch (IOException e) {
			System.out.println("Erreur : " + e.getMessage());
			e.printStackTrace();
		} /*finally {
			if (entree != null) entree.close();
			if (sortie != null) sortie.close();
		}*/
	}

}
