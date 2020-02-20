package homework_12;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		Car car = new Car("Kia",2012);

		Body body1 = new Body("red",5);
		Body body2 = new Body("yellow",4);
		Body body3 = new Body("white",3);
		Helm helm1 = new Helm(0.1,"dark");
		Helm helm2 = new Helm(0.3,"red");
		Helm helm3 = new Helm(0.2,"blue");
		Wheel wheel1 = new Wheel(0.4,"cotton");
		Wheel wheel2 = new Wheel(0.5,"cot");
		Wheel wheel3 = new Wheel(0.6,"coton");
		
		ArrayList<Body> arrayBody = new ArrayList<Body>();
		arrayBody.add(body1);
		arrayBody.add(body2);
		arrayBody.add(body3);
		
		ArrayList<Helm> arrayHelm = new ArrayList<Helm>();
		arrayHelm.add(helm1);
		arrayHelm.add(helm2);
		arrayHelm.add(helm3);
		
		ArrayList<Wheel> arrayWheel = new ArrayList<Wheel>();
		arrayWheel.add(wheel1);
		arrayWheel.add(wheel2);
		arrayWheel.add(wheel3);
		
		car.setBody(arrayBody);
		car.setHelm(arrayHelm);
		car.setWheel(arrayWheel);
		
		System.out.println(car);
	}

}
