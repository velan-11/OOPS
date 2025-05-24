package programs;

public class BranchDriver {
	public static void main(String[] args) {
		Branch b1=new Branch();
		b1.setDetails("Smith","133");
		System.out.println("Manager name: "+b1.getMn());
		System.out.println("IFSC: "+b1.getIfsc());
	}
}
