package programs;

import java.time.LocalDateTime;//to print the current date and time
//prog1
public class Employee {
	int id;
	String name;
	String dept;
	static String companyName = "Google";// it is static since it is common for all employees
	static int count;

	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;// creating the constructor to initialize the employee details
		this.dept = dept;
	}

	static {
		System.out.println("Employee Tracking System");//it will be printed only in the beginning
	}
	{
		count++;//it will be incremented whenever the object is created
	}
	{
		System.out.println("Time of Creation:"+LocalDateTime.now());
	}

	void display() {
		System.out.println("ID:" + id);
		System.out.println("Name:" + name);
		System.out.println("Department:" + dept);
		System.out.println("Company Name:" + companyName);
	}

}
