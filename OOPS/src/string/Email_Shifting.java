package string;
//to replace gmail.com to yahoo.com
import java.util.Arrays;
import java.util.Scanner;

public class Email_Shifting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		String s[]=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();		}
		System.out.println(shift(s));
		}
	public static int shift(String s[]) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].contains("@gmail.com")) {//checking if each string contains @gmail.com
//			if(!(s[i].contains("@yahoo.com"))){//if
				s[i]=s[i].replace("gmail.com", "yahoo.com");
				count++;
			}
		}
		
		System.out.println(Arrays.toString(s));
		return count;
	}
	
}
