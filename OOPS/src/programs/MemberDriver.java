package programs;

public class MemberDriver {
	public static void main(String[] args) {
		
		System.out.println("Total number of members:"+getTotalMembers());
		Member m1=new Member("Velan");
		m1.showMemberDetail();
		Member m2=new Member("Jaya kumar");
		m2.showMemberDetail();
		System.out.println("Total number of members:"+getTotalMembers());
		
	}
	public static int getTotalMembers() {
		return Member.total;
	}
}
