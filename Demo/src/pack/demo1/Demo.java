package pack.demo1;
import java.util.ArrayList;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		System.out.println(args[1]);
		//System.out.println('t');
		double r = (double) 3/2;
		//System.out.println(r);
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
		String chaine;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez une chaine de caractere au clavier");
		chaine = clavier.nextLine();
		System.out.println("Longueur de la chaine : " + chaine + "=" + chaine.length());
		clavier.close();
		int tab1[]= {10,20,30}; 
		int tab2[]= new int[3];
		tab2=tab1;
		tab2[0]=100;
		System.out.println(tab2[0] + " " + tab1[0]);
		/*final Point p1 = new Point();
		int i = 12;
		p1.modifier(2,4);
		toto(i,p1);
		String toto = new String("bonjour");
		String tata = new String("bonjour");
		int ret = toto.compareTo(tata);*/
		Personne p = new Personne("toto");
		Stagiaire s = new Stagiaire("tata", "java");
		Musicien m = new Musicien("titi", "guitare");
		Personne p1, p2, p3;
		p1 = p;
		p2 = s;
		p3 = m;
		if (p1 instanceof Personne) {
			p1.afficher();
		}
		if (p2 instanceof Stagiaire) {
			p2.afficher();
		}
		if (p3 instanceof Musicien) {
			p3.afficher();
		}
		p1.afficher();
		p2.afficher();
		p3.afficher();
		ArrayList <Personne> listePersonnes = new ArrayList <Personne>();
		listePersonnes.add(p);
		listePersonnes.add(s);
		listePersonnes.add(m);
		for(Personne pers : listePersonnes) {
			if (compare(pers, p)) {
				pers.afficher();
			}
		}
	}
	/*private static void toto(int i, Point p) {
		p.modifier(251, 356);
		i = 101;
	}*/
	public static boolean compare(Object o1, Object o2) {
		return o1.equals(o2);
	}
}
