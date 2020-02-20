package homework_04;

public class MainClassForAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Lion",30,4);
		System.out.println("The name of the animal = "+animal.getName()+",Speed of the animal = "+animal.getSpeed()+",Age of the animal = "+animal.getAge()+" .");
		
		animal.setName("Tiger");
		animal.setAge(6);
		animal.setSpeed(20);
		
		System.out.println();
		System.out.println("The name of the animal = "+animal.getName()+",Speed of the animal = "+animal.getSpeed()+",Age of the animal = "+animal.getAge()+" .");
	}

}
