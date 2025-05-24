package inheritance;

public class DoctorDriver {
	public static void main(String[] args) {
		Doctor d1=new Doctor("Anbuselvan","122F");
		Cardiologist c1=new Cardiologist("tamil","123f");
		System.out.println(c1.name);
		System.out.println(c1.docLicense);
		System.out.println(d1.name);
		System.out.println(d1.docLicense);
	}
}
