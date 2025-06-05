package string;
import java.util.*;
public class Rotation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		System.out.println(rotation(s,s1));
	}
	public static boolean rotation(String s,String s1) {
		String s2=s+s;
		if(s2.contains(s1)) {
			return true;
		}
		return false;
		
	}
	/*
	 * public static boolean rotation(String s,String s1) { byte a[]=s.getBytes();
	 * byte b[]=s.getBytes(); sort(a); sort(b); for(int i=0;i<a.length;i++) {
	 * if(a[i]!=b[i]) { return false; } } return true; }
	 * 
	 * 
	 * public static void sort(byte a[]) { for(int i=0;i<a.length-1;i++) {//pass
	 * for(int j=0;j<a.length-1-i;j++) { if(a[j]>a[j+1]) {//swap byte temp=a[j];
	 * a[j]=a[j+1]; a[j+1]=temp; } } } }
	 */
		}
	