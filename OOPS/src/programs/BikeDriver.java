package programs;
//passing of reference variable into the method and printing it;
public class BikeDriver {
	public static void main(String[] args) {
		Bike b1=new Bike();
		System.out.println(b1);
		Bike.display(b1);
	}
}
