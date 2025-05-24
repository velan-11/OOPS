package programs;

public class Mobile {
	private String brand;
	private double price;
	private int ram;
	Battery battery=new Battery("Li-ion",5500);
	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	
	public Mobile() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public void mobileDetails() {
		System.out.println("Mobile Details:");
		System.out.println("Battery Type: "+battery.getType());
		System.out.println("Price: "+this.price);
		System.out.println("Ram: "+this.ram);
		System.out.println("Brand:"+this.brand);
		
	}
	
}
