package programs;

public class Battery {
	private String type;
	private int capacity;
	
	public Battery() {
		
	}
	public Battery(String type,int capacity) {
		this.type=type;
		this.capacity=capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public String getType() {
		return type;
	}
	
}
