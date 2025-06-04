package polymorphism;

public class Bike extends Cab{
	
	private String bikeName;
	private String bikeColor;

	
	public Bike(String bikeName, String bikeColor) {
		super();
		this.bikeName = bikeName;
		this.bikeColor = bikeColor;
	}
	public void book() {
		System.out.println("Bike is booked");
	}


	public void details() {
		System.out.println("Bike Name: "+bikeName);
		System.out.println("Bike Color: "+bikeColor);
	}
}
