package sample;

public class Demo1 {
public static void main(String[] args) {
	Book b1=new Book("velu",121);
	b1.display();
	
}
}
class Book{
	String name;
	double price;
	Book(String a,double b){
		name=a;
		price=b;
	}
	void display() {
		System.out.println(name);
		System.out.println(price);
	}
	}

