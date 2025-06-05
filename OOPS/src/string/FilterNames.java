package string;

import java.util.Scanner;

public class FilterNames {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String s[]=new String[size]; 
		for(int i=0;i<size;i++) {
			s[i]=sc.next();
		}
		char ch=sc.next().charAt(0);
		filter(s,ch);
	}
	public static void filter(String a[],char ch) {
	
		for(int i=0;i<a.length;i++) {
			if(a[i].toLowerCase().charAt(0)==ch) {
				System.out.println(a[i]);
				
			}
			
		}
	}
}
