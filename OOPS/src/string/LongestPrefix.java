package string;

import java.util.Scanner;

public class LongestPrefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String s[]=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();
		}
		System.out.println(loong(s));
	}
	public static String loong(String s[]) {
		String prefix=s[0];
		for(int i=0;i<s.length;i++) {
			while(!s[i].startsWith(prefix)) {
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty()) return "";
					
				
				}
			}
		return prefix;
		
	}
}
