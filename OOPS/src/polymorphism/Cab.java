package polymorphism;

public class Cab {
	
	private Driver d1=new Driver("Velu","1234567890");
	
	public void book() {
		System.out.println("Booked.....");
	}
	public void driverDetails() {
		System.out.println("Driver Name:"+d1.getDriverName());
		System.out.println("Driver PhoneNo:"+d1.getDriverPhoneNo());
	}
}
