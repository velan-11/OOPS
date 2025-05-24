package programs;
//template for the lazy instantiation
public class Radio {
	private String name;
	private String color;
	public Radio(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Radio() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
