package inheritance;

public class Doctor {
	String name;
	String docLicense;
	public Doctor(String name, String docLicense) {
		super();
		this.name = name;
		this.docLicense = docLicense;
	}
	public Doctor() {
		super();
	}
	public void checkPulse() {
		System.out.println("Pulse is normal");
	}
}
