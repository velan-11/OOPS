package sample;
import java.text.NumberFormat;
import java.util.Locale;
public class Demo1 {
public static void main(String[] args) {
	Book b1=new Book("velu",121);
	double a=2324.90;
	NumberFormat f1=NumberFormat.getCurrencyInstance(Locale.US);
	String velu=f1.format(a);
	System.out.println(velu);
	/* b1.display(); */
	
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

