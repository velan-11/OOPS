package object_class;

//overriding the toString method present in the object class to directly 
//print the properties instead of printing the reference
public class Moon2 {
	String color;
	String shape;
	public Moon2(String color, String shape) {
		super();
		this.color = color;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Moon [color=" + color + ", shape=" + shape + "]";
	}
	public static void main(String[] args) {
		Moon2 m1=new Moon2("White","round");
		System.out.println(m1);
	}

}
