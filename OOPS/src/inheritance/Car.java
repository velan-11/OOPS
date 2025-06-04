package inheritance;

public class Car extends Cab {
	String ac;

	public Car(String driverId, int noOfWheels, String ac) {
		super(driverId, noOfWheels);
		this.ac = ac;
	}
	public Car() {
		super();
		
	}

	
}
