package programs;

public class HasAmobileDriver {
	public static void main(String[] args) {
		Mobile mobile=new Mobile("Vivo",25000,16);
		mobile.mobileDetails();
		System.out.println("Capacity: "+mobile.getBattery().getCapacity());
		
	}
}
