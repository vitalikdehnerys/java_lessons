package homework_12;

import java.util.ArrayList;

public class Car {
	protected String model;
	protected int year ;
	protected ArrayList<Helm> helm;
	protected ArrayList<Wheel> wheel;
	protected ArrayList<Body> body;
	
	public Car() {}
	
	public Car(String model,int year) {
		this.model=model;
		this.year=year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Helm> getHelm() {
		return helm;
	}

	public void setHelm(ArrayList<Helm> helm) {
		this.helm = helm;
	}

	public ArrayList<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(ArrayList<Wheel> wheel) {
		this.wheel = wheel;
	}

	public ArrayList<Body> getBody() {
		return body;
	}

	public void setBody(ArrayList<Body> body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", " + helm + ", " + wheel + ", " + body
				+ "]";
	}
	
	
}
