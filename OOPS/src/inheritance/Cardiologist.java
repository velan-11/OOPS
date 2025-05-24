package inheritance;

public class Cardiologist extends Doctor {
	
	public Cardiologist() {
		super();
	}

	public Cardiologist(String name, String docLicense) {
		super(name, docLicense);
	}

	public void byPass() {
		System.out.println("bypass is done");
	}
}
