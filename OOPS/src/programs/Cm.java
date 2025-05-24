package programs;

public class Cm {
	private String name;
	private double experience;
	public Cm(String name, double experience) {
		super();
		this.name = name;
		this.experience = experience;
	}
	public Cm() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public void cmDetails() {
		System.out.println(this.name);
		System.out.println(this.experience);
}
}
