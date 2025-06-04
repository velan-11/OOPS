package string;
// to check if the string contains only the digits from 0 to 9;
import java.util.Scanner;

public class Valid_OTP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(message(s));
	}
	public static boolean message(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				count++;
			}
		}
		return count==s.length();
	}
	
}
