package inheritance;

public class Bike extends Cab {
	String helmet;
	public Bike() {
		super();
		
	}
	public Bike(String driverId, int noOfWheels, String helmet) {
		super(driverId, noOfWheels);
		this.helmet = helmet;
	}
	
}
