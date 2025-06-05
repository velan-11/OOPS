package string;
//to reverse the string only the words not the characters  
//ex: the sky is blue ---->blue is sky the
import java.util.Scanner;

public class ReverseWithSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	public static String reverse(String s) {
		String a[]=s.trim().split(" ");
		String rev="";
		for(int i=a.length-1;i>=0;i--) {
			rev+=a[i]+" ";
		
		
	}
		return rev;
	}
}
