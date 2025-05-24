package programs;

public class BagDriver {
	public static void main(String[] args) {
		Bag b1=new Bag();
		b1.setDetails("Green",2500);
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
		Bag b2=new Bag();
		b2.setDetails("White",5000);
		System.out.println(b2.getColor());
		System.out.println(b2.getPrice());
		
		
	}
}
