package string;
//to find the longest word in the String
import java.util.Scanner;

public class Longest_word {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		String s=sc.nextLine();
		System.out.println(longest(s));
	}
	public static String longest(String s) {
		String a[]=s.trim().split(" ");
		String loong=a[0];
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>count) {
				count=a[i].length();
				loong=a[i];
			}
		}
		return loong;
		
	}
}
