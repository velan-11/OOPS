package string;
//to check the valid email
import java.util.Scanner;

public class Valid_email {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		String s[]=new String[size];
		for(int i=0;i<s.length;i++) {
			s[i]=sc.next();		}
		System.out.println(valid(s));
		}
	public static int valid(String a[]) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			//checking if each string contains @ symbol and making sure first char is not a digit
			if(a[i].contains("@") && !Character.isDigit(a[i].charAt(0))) {
				//retrieving the substring till @ and checking only digits and alphabets are present
					String s=a[i].substring(0,a[i].indexOf('@'));
					boolean flag=true;
					for(int j=0;j<s.length();j++) {
						if(!(s.charAt(j)>='a' && s.charAt(j)<='z' || s.charAt(j)>='0' && s.charAt(j)<='9')) {
							flag=false;
						}
					}
					if(flag) {
						count++;
					}
				}
			//checking if the string contains any one of the following
			String s1=a[i].substring(a[i].indexOf('@')+1);
			if(!(s1.equals("gmail.com") || (s1.equals("yahoo.com")) || s1.equals("hotmail.com"))) {
				count--;
			}
			}
		return count;
		}
	}

