package pack.demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Point> list = new ArrayList <Point>();
		Point p1 = new Point(10, 20);
		list.add(p1);
		list.add(new Point(20,40));
		list.add(new Point(30,50));
		if(list.contains(p1)) 
			System.out.println("ok");
		else
			System.out.println("ko");
		if(list.contains(new Point(20, 40)))
			System.out.println("ok");
		else
			System.out.println("ko");
		for (Iterator i = list.iterator(); i.hasNext(); )
			System.out.println(i.next());
	}

}
