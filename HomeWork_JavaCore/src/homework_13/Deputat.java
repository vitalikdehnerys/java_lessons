package homework_13;

import java.util.Scanner;

public class Deputat extends Human implements Comparable<Deputat>{
	protected String name;
	protected String surname;
	protected int age;
	protected boolean takeBribe;
	protected int sizeOfBride;
	
	@Override
	public String toString() {
		return "Deputat [name=" + name + ", surname=" + surname + ", age=" + age + ", takeBribe=" + takeBribe
				+ ", sizeOfBride=" + sizeOfBride + "]";
	}

	Deputat(){}
	
	Deputat(String name,String surname,int age,boolean takeBribe,int weight,int height){
		super(weight, height);
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.takeBribe=takeBribe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCorruptionist() {
		return takeBribe;
	}

	public void setCorruptionist(boolean takeBribe) {
		this.takeBribe = takeBribe;
	}
	
	public void giveBride() {
		if(!takeBribe) {
			System.out.println("This deputat doesn't take brides");
		}else {
			Scanner scan = new Scanner(System.in);
			int newBride=scan.nextInt();
			if(newBride>5000) {
				System.out.println("Police imprison this deputat..");
			}else {
				sizeOfBride=newBride;
			}
			scan.close();
		}
	}
	
	

	@Override
	public int compareTo(Deputat dep) {
		if(this.name.equals(dep.name)) {
			return 1;
		}else {
			return -1;
		}
		
	}
	
	
	
}
