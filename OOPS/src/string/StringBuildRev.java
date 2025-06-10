package string;

public class StringBuildRev {
	public static void main(String[] args) {
		String s="velan";
		StringBuilder s1=new StringBuilder(s);
		System.out.println(s);
		System.out.println(s1.reverse());
		System.out.println(s1.equals(s));
	}
}
