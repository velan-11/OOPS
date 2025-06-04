package string;

import java.util.Scanner;
//to find the count of vowels and consonants
public class CountVowelConso {
			public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string:");
			String s=sc.nextLine();
			System.out.println(count(s));
		}
		public static String count(String s) {
			int vowel=0;
			int consonant=0;
			s=s.toLowerCase();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>='a' && s.charAt(i)<'z') {
					switch(s.charAt(i)) {
					case 'a':
						vowel++;
						break;
					case 'e':
						vowel++;
						break; 
					case 'i':
						vowel++;
						break;
					case 'o':
						vowel++;
						break;
					case 'u':
						vowel++;
						break;
					default:
						consonant++;
					}
				}
			}
			return "vowel "+vowel+" consonant "+consonant;
		
	}
		
}
