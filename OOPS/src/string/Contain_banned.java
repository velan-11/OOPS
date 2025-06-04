package string;
//check if certain banned words present in the message,if so return true;
import java.util.Scanner;

public class Contain_banned {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		System.out.println(check_message(s));
	}
	public static boolean check_message(String s) {
		String r[]= {"bad","hate","ugly"};
		for(int i=0;i<r.length;i++) {
			if(s.contains(r[i])) {
				return true;
			}
		}
		
		return false;
	}
}
