package programs;

public class Sim {
	private double balance;
	private int phoneNo;
	public Sim(double balance, int phoneNo) {
		super();
		this.balance = balance;
		this.phoneNo = phoneNo;
	}
	public Sim() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
