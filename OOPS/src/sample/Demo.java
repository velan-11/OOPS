package sample;
//statement is a complete command(ex:int a=10;)
//if an expression return a boolean value then it is called as condition.(10==20)
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3,4 };

		System.out.println(Arrays.toString(demo1(a)));

	}

	public static int[] demo1(int a[]) {
		int sum = 0;
		int mul = 1;
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				sum += a[i];
			}

			if (a[i] % 2 != 0) {
				mul *= a[i];
			}
		}
		return new int[] { sum, mul };

	}
}
