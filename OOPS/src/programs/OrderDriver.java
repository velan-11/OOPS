package programs;

public class OrderDriver {
	public static void main(String[] args) {
		Order o1=new Order();
		o1.setProductName("Camera");
		o1.setId(123);
		o1.setPrice(60000);
		o1.setPayment("phonepay");
		System.out.println(o1.getProductName());
		System.out.println(o1.getId());
		System.out.println(o1.getPrice());
		System.out.println(o1.getPayment());
		Order o2=new Order();
		o2.setProductName("Go_pro");
		o2.setId(1232);
		o2.setPrice(52000);
		o2.setPayment("cash on delivery");
		System.out.println(o2.getProductName());
		System.out.println(o2.getId());
		System.out.println(o2.getPrice());
		System.out.println(o2.getPayment());
	}
}
