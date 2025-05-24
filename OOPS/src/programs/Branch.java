package programs;

public class Branch {
	private String managerName;
	private String ifsc;
	public String getMn() {//getter method
		return this.managerName;
	}
	public String getIfsc() {
		return this.ifsc;//getter method
	}
	public void setDetails(String managerName,String ifsc) {
		this.managerName=managerName;
		this.ifsc=ifsc;//setter method
}
	
}
