package sample;

public class Moon {
	String color;
	String shape;
	public Moon(String color, String shape) {
		super();
		this.color = color;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Moon [color=" + color + ", shape=" + shape + "]";
	}
	public static void main(String[] args) {
		Moon m1=new Moon("White","round");
		System.out.println(m1);
	}


}
