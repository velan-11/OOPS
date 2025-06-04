package inheritance;

public class Auto extends Cab {
	String lever;

	public Auto(String driverId, int noOfWheels,String lever) {
		super(driverId, noOfWheels);
		this.lever=lever;
	}

	public Auto() {
		super();
		
	}
	
}
