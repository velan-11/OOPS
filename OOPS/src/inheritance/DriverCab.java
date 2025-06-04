package inheritance;

import java.util.Scanner;

public class DriverCab {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press: \n 1.Bike(1 for bike) \n 2.Auto(2 for auto) \n 3.Car(3 for car)\n ");
		int number=sc.nextInt();
		Cab c1;
		switch(number) {
		case 1:{
			c1=new Bike();
			System.out.println("Bike is booked");
			}break;
		case 2:{
			 c1=new Auto();
			 System.out.println("Auto is booked");
		}break;
		case 3:{
			c1=new Car();
			System.out.println("Car is cooked");
		}break;
		default:{
			System.out.println("Enter a valid choice");
		}
		}
}
	}
