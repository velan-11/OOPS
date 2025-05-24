package programs;
/*-->Print "Employee Tracking System"

-->We want to track employees in a company. Each employee has a unique ID, name, and department and company Name.

-->The company also has a static count of how many employees have been created.

-->Increase the count of Employee whenever the object is created.

-->Print date and time for every employee object created.*/

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "velan", "development");
		e1.display();
		Employee e2 = new Employee(2, "Velmurugan", "design");
		e2.display();
	}
}
