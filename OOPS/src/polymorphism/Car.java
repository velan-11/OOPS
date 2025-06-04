package polymorphism;

public class Car extends Cab{
	private String carBrand;
	private String carColor;

	
	public Car(String carBrand, String carColor) {
		super();
		this.carBrand = carBrand;
		this.carColor = carColor;
	}
	public void book() {
		System.out.println("Car is booked");
	}

	public void details() {
		System.out.println("Car Brand: "+carBrand);
		System.out.println("Car Color: "+carColor);
	}
	
}
