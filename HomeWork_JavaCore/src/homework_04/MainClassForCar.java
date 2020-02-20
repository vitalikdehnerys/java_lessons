package homework_04;
public class MainClassForCar {

	public static void main(String[] args) {
		Car car = new Car("Kia",2012);
		Body body = new Body("red",4);
		Helm helm = new Helm(0.3,"dark");
		Wheel wheel = new Wheel(0.5,"cotton");
		
		car.setBody(body);
		car.setHelm(helm);
		car.setWheel(wheel);
		
		System.out.println(car);
		System.out.println();
		car.body.ChangeBody();
		car.helm.ChangeHelm();
		car.wheel.ChangeWheel();
		
		System.out.println(car);
	}

}
