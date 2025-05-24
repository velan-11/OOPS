package programs;

public class Atm {
	private double money;
	private String location;
	public double getMoney(int pin) {
		if(count_pin(pin)==4) {//checking if the pin is 4 digits
			if(pin==1234) {//checking if the pin is correct
				return this.money;
			}
		}
		return 0;
	}
	public void setDetails(double money,String location) {
		this.money = money;
		this.location=location;
	}
	public String getLocation() {
		
		
		return this.location;
	}
	int count_pin(int pin) {
		int count=0;
		while(pin!=0) {
			count++;
			pin/=10;
		}
		return count;
	}
	
	
	

}
