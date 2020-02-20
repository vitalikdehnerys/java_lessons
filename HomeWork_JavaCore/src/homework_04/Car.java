package homework_04;
public class Car {
	protected String model;
	protected int year ;
	protected Helm helm;
	protected Wheel wheel;
	protected Body body;
	
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

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", " + helm + ", " + wheel + ", " + body
				+ "]";
	}
	
	
}
