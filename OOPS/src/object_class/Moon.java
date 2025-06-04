package object_class;
//overriding the equals method present in the Object class
//where there is more than one object present ,then you can use AND operator
public class Moon {
	int distance;
	
	public Moon(int distance) {
		super();
		this.distance = distance;
	}
	@Override
	public boolean equals(Object o)
	{
		Moon m2=(Moon)o;//downcasting
		return this.distance==m2.distance;
	}
	public static void main(String[] args) {
		Moon m1=new Moon(500);
		Moon m2=new Moon(500);
		System.out.println(m1.equals(m2));
	}
}
