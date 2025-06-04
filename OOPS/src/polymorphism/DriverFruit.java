package polymorphism;
//overriding
import java.util.Scanner;

public class DriverFruit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 for grape");
		System.out.print("\nEnter 2 for apple");
		System.out.print("\nEnter 3 for banana");
		System.out.print("\nEnter 4 for orange");
		int choice =sc.nextInt();
		Fruit f1=null;
		switch(choice) {
		case 1: f1=new Grape();
				f1.taste();
				break;
		case 2: f1=new Apple();
		f1.taste();
		break;
		case 3: f1=new Banana();
		f1.taste();
		break;
		case 4: f1=new Orange();
		f1.taste();
		break;
		}
		}
}
