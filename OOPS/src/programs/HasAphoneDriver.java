package programs;

public class HasAphoneDriver {
 public static void main(String[] args) {
	Phone p1=new Phone("Samsung","blue",13234);
	System.out.println("Capacity: "+p1.getM1().getCapacity());
	p1.getSim(300,9171);
	System.out.println("Phone no : "+p1.getSim2().getPhoneNo());
}
}
