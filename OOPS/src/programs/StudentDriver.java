package programs;

/*create a student class with two private properties ,
create getters and setters and also constructor.
create method in utility class that prints the details of students.
when the object is created in driver class gives the details.*/
public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student("Vignesh",339);
		StudentUtility.display(s1);
		Student s2=new Student("Samantha",337);
		StudentUtility.display(s2);
		
	}
}
