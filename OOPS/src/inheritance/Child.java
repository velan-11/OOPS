package inheritance;

public class Child extends Parent {
	public Child() {
		super();
	}
	public static void main(String[] args) {
		Parent p1=new Parent("parent",121);
		Child c1=new Child();
		System.out.println(c1.age);
		display();
	}
}
