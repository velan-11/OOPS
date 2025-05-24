package programs;

//Has-A-relationship
public class Car {
	private String color;
	private Engine e1 = new Engine("1200cc");// early instantiation
	// this is done using single line single line initializer
	private Radio r1;//lazy instantiation
	

	public Car() {
		super();
	}

	public Car(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public Engine getE1() {
		return e1;
	}
	public void getRadio(String name,String color) {
		r1=new Radio(name,color);
	}
	public Radio getRadio2() {
		return this.r1;
	}

}
