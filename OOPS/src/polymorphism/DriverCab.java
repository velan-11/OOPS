package polymorphism;

//overriding
import java.util.Scanner;

public class DriverCab {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 for Car");
		System.out.print("\nEnter 2 for Bike");
		System.out.print("\nEnter 3 for Auto");
		System.out.print("\nYour choice:");
		int choice = sc.nextInt();
		Cab c1 = null;
		switch (choice) {
		case 1: {
			c1 = new Car("BMW", "WHITE");

			c1.driverDetails();
			Car c2 = (Car) c1;
			c2.book();
			c2.details();

			break;
		}

		case 2: {
			c1 = new Bike("Hayabusa", "WHITE");

			c1.driverDetails();

			Bike c2 = (Bike) c1;
			c2.book();
			c2.details();
			break;

		}

		case 3: {
			c1 = new Auto("Black", "123");

			c1.driverDetails();

			Auto c2 = (Auto) c1;
			c2.book();
			c2.display();
			break;
		}

		default:
			System.out.println("Enter a valid choice");
		}
	}
}
