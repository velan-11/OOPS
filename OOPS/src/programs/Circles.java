package programs;

public class Circles {
	static double pi=3.14;
	public static void getArea(Circle c) {
		double area=(c.getRadius()*c.getRadius())*pi;
		System.out.println(area);
		
	}
	public static void getCirucumference(Circle c) {
		double circumference=2*pi*c.getRadius();
		System.out.println(circumference);
	}
	
	
}
