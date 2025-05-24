package programs;

/*You are required to design a class LibraryMember to manage members of a library system. Implement the following features in your class:
-->A static variable totalMembers that keeps track of the total number of members registered.
-->Non-static variables to store each member's name and member ID.
-->A static initializer block that prints "Library Management system".
-->A non-static initializer block that prints "Creating a new LibraryMember object..." before each member object is created.
-->A constructor that takes a member's name as input, increments the total member count, assigns it as the member's ID, and prints "Member registered: [Name], ID: [ID]".
-->A static method getTotalMembers() that returns the total number of members.
-->A non-static method showMemberDetails() that prints the name and ID of the member.
Also, write a LibrarySystem class with a main method that:
:: Displays the total number of members before creating any member.
::Creates at least two members.
:: Displays the details of each member.
:: Displays the updated total number of members after creation*/
public class Member {
	static int total;
	String name;
	int id;
	static{// it will get executed only once 
		System.out.println("Library Management System");
		}
	{//it will be executed every time the object is created
		System.out.println("Creating a new Library Member...");
	}
	public Member(String name) {
		this.name = name;
		total++;//increments when new member is added
		id=total;//Total member is assigned to id of new member
		System.out.println("Member registered: "+name +" ID:"+id);
		
	}
	void showMemberDetail(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
	

}
