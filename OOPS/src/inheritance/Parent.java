package inheritance;

public class Parent {
	String name;
	int age;
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Parent() {
		super();
	}
	static void display() {
		System.out.println("parent");
	}
}
