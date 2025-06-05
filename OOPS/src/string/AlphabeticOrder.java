package string;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        Arrays.sort(names);
        int current=0;
        for(String s:names) {
        	if(s.length()!=current) {
        		if(current!=0) {
        		System.out.println();
        	}
        	current=s.length();
        }
        	System.out.print(s+" ");
        }
        System.out.println();

       
    }
}
