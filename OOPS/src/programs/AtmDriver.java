package programs;
import java.util.Scanner;


public class AtmDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount:");
		int withdraw=sc.nextInt();
		System.out.print("Enter the pin:");
		int pin=sc.nextInt();
		Atm a1=new Atm();
		a1.setDetails(withdraw, "Avadi");
		double money=a1.getMoney(pin);
		if(money==0) {
			System.out.println("Enter a valid pin");
		}else {
			System.out.println(money);
		}
	}
}
