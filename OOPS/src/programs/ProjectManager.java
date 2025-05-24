package programs;

public class ProjectManager {
	private String name;
	private int empID;
	private Project p1=new Project("Tsunade","106");
	public ProjectManager(String name, int empID) {
		super();
		this.name = name;
		this.empID = empID;
	}
	public ProjectManager() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public Project getP1() {
		return p1;
	}
	public void setP1(Project p1) {
		this.p1 = p1;
	}
	
}
