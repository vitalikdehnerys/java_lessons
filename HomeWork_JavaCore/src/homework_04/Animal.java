package homework_04;
public class Animal {
	private String name;
	private int speed;
	private int age;
	
	public Animal() {}
	
	public Animal(String name,int speed,int age) {
		this.age=age;
		this.name=name;
		this.speed=speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
