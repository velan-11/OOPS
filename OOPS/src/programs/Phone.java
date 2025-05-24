package programs;

public class Phone {
	private String model;
	private String color;
	private int price;
	private Sim s1;
	External_Memory m1=new External_Memory("sam",12,34);
	public Phone(String model, String color, int price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}
	public Phone() {
		super();
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public External_Memory getM1() {
		return this.m1;
	}
	public void getSim(double balance,int phoneNo) {
		s1=new Sim(balance,phoneNo);
	}public Sim getSim2() {
		return this.s1;
	}
	
}
