package polymorphism;

public class Auto extends Cab {
	private String autoColor;
	private String autoNo;
	public Auto(String autoColor, String autoNo) {
		super();
		this.autoColor = autoColor;
		this.autoNo = autoNo;
	}
	public void book() {
		System.out.println("Auto is booked");
	}
	public void display() {
		System.out.println("Auto Color:"+autoColor);
		System.out.println("Auto No"+autoNo);
	}
}
	
	
