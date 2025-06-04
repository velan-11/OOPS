package string;
//
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(message(s));
		
	}
	public static boolean message(String s) {
		s=s.trim().toLowerCase();
		String cleaned="";
		String rev="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				if(s.charAt(i)!=' ') {
					cleaned+=s.charAt(i);
				}			}
		}
		System.out.println(cleaned);
		for(int i=0;i<cleaned.length();i++) {
			
				rev=cleaned.charAt(i)+rev;	
				}
		System.out.println(rev);
		
		return rev.equals(cleaned);
	}
}
