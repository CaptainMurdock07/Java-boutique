package pack.demo4;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public boolean equals (Object o) {
		if (o instanceof Point) 
			return this.x == ((Point) o).x && this.y == ((Point) o).y;
		else
			return false;
	}
}
