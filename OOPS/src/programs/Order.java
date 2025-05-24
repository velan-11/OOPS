package programs;
//encapsulation
public class Order {
	private String productName;
	private int id;
	private double price;
	private String payment;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
}
