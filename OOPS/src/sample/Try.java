package sample;

import java.util.Arrays;

import java.util.Scanner;

//to find the frequency of every elements in the array
public class Try {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the array: ");
		int size = sc.nextInt();
		System.out.print("enter the array elements:");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		

		frequency(a);

	}

	public static void frequency(int a[]) {
		for(int i=0,j=a.length-1;j>=i;i++) {
			int temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			j--;
		}
		System.out.println(Arrays.toString(a));
	}
}

