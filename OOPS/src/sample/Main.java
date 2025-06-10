package sample;
//classCastException
public class Main {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		b=(B)a;
	}
}
class A{}
class B extends A{}
