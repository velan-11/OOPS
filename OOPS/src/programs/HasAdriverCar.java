package programs;
//Has-A relationship between Car and Engine using the Early Instantiation
public class HasAdriverCar {
	public static void main(String[] args) {
		Car car=new Car("black");
		System.out.println(car.getE1().getPower());
		car.getRadio("marshal","yellow");
		System.out.println(car.getRadio2().getName());
	}
}
