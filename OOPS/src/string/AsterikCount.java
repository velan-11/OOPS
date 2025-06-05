package string;

import java.util.Scanner;

public class AsterikCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		count(s);
	}
	public static void count(String s) {
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='#') {
				count++;
		}else {
			count1++;
			}
		}
		if(count==count1) {
			System.out.println("Balanced");
	}else if(count>count1) {
		System.out.println(count-count1+" * should be added");
	}else {
		System.out.println(count1-count+" # should be added");
	}
}}
