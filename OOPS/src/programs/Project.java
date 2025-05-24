package programs;

public class Project {
	private String projectName;
	private String projectId;
	public Project() {
		super();
	}
	public Project(String projectName, String projectId) {
		super();
		this.projectName = projectName;
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public void projectDetails() {
		System.out.println("Project Name: "+this.projectName);
		System.out.println("Project ID: "+this.projectId);
	}
}
