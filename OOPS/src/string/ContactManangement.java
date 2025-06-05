package string;

import java.util.Scanner;

public class ContactManangement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String s[]=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
		} 
		manage(s);
	}
	public static void manage(String s[]) {
		
	}
}
