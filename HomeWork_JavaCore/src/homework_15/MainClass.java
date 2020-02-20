package homework_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Map<Person,List<Animal>> map = new HashMap();
		Scanner scan = new Scanner(System.in);
		
		Person person1 = new Person("Vitalik",21);
		Person person2 = new Person("Vova",27);
		Person person3 = new Person("Ira",23);
		Person person4 = new Person("Jon",31);
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		Animal animal1 = new Animal(TypeOfAnimal.CAT,"Tom");
		Animal animal2 = new Animal(TypeOfAnimal.DOG,"Barsik");
		Animal animal3 = new Animal(TypeOfAnimal.CAT,"Murchuk");
		Animal animal4 = new Animal(TypeOfAnimal.DOG,"Brovko");
		Animal animal5 = new Animal(TypeOfAnimal.CAT,"Murka");
		Animal animal6 = new Animal(TypeOfAnimal.DOG,"Muhtar");
		Animal animal7 = new Animal(TypeOfAnimal.CAT,"Red");
		Animal animal8 = new Animal(TypeOfAnimal.DOG,"Rex");
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		ArrayList<Animal> animals1 = new ArrayList<Animal>();
		ArrayList<Animal> animals2 = new ArrayList<Animal>();
		ArrayList<Animal> animals3 = new ArrayList<Animal>();
		ArrayList<Animal> animals4 = new ArrayList<Animal>();
		
		animals1.add(animal1);
		animals1.add(animal2);
		animals1.add(animal3);
		animals1.add(animal4);
		
		animals2.add(animal5);
		animals2.add(animal2);
		animals2.add(animal3);
		animals2.add(animal6);
		
		animals3.add(animal1);
		animals3.add(animal2);
		animals3.add(animal7);
		animals3.add(animal8);
		
		animals4.add(animal6);
		animals4.add(animal5);
		animals4.add(animal3);
		animals4.add(animal4);
		
		map.put(person1, animals1);
		map.put(person2, animals2);
		map.put(person3, animals3);
		map.put(person4, animals4);
		
		ZooClub zoo = new ZooClub(map);

		while(true) {
			System.out.println("Please choose one method and enter its : " );
			System.out.println("addMember");
			System.out.println("addMemberAnimal");
			System.out.println("deleteMemberAnimal");
			System.out.println("deleteMemberFromClub");
			System.out.println("deleteAnAnimalFromAllMembers");
			System.out.println("outputZooclubOnScreen");
			System.out.println("exitFromProgram");
			
			String condition=scan.next();
			
			switch(condition) {
				case("addMember"):
					Person person = new Person();
					System.out.println("Please enter name of new member : ");
					String name=scan.next();
					person.setName(name);
					System.out.println("Please enter member age's : ");
					int age=scan.nextInt();
					person.setAge(age);
					map.put(person, animals);
					zoo.map=map;
					System.out.println(zoo.map);
					break;
					
				case("addMemberAnimal"):
					System.out.println("Please enter name of member : ");
					String name1=scan.next();
					Iterator iterator1 = zoo.map.keySet().iterator();
					while(iterator1.hasNext()) {
						Person pers =(Person) iterator1.next();
						if(pers.name.equals(name1)) {
							System.out.println(pers.name);
							animals.addAll(zoo.map.get(pers));
							Animal animal = new Animal();
							System.out.println("Enter name od animal");
							animal.setName(scan.next());
							System.out.println("Enter type od animal");
							animal.setType(scan.next());
							animals.add(animal);
							zoo.map.put(pers, animals);
							System.out.println(zoo.map.get(pers));
						}
					}
					break;
					
				case("deleteMemberAnimal"):
					System.out.println("Please enter name of member : ");
					String name2=scan.next();
					System.out.println("Please enter name of member's animal : ");
					String pet =scan.next();
					Iterator iterator2 = zoo.map.keySet().iterator();
					while(iterator2.hasNext()) {
						Person pers =(Person) iterator2.next();
						if(pers.name.equals(name2)) {
							System.out.println(pers.name);
							animals.addAll(zoo.map.get(pers));
							for (int i = 0; i < animals.size(); i++) {
					            if (animals.get(i).name.equals(pet)) {
					                animals.remove(i);
					            }
					        }
							zoo.map.put(pers, animals);
							System.out.println(zoo.map.get(pers));
						}
					}
					break;
					
				case("deleteMemberFromClub"):
					System.out.println("Please enter name of member : ");
					String name3=scan.next();
					Iterator iterator3 = zoo.map.keySet().iterator();
					while(iterator3.hasNext()) {
						Person pers =(Person) iterator3.next();
						if(pers.name.equals(name3)) {
							iterator3.remove();
						}
					}
					System.out.println("Member "+ name3+ " was delete .");
					break;
					
				case("deleteAnAnimalFromAllMembers"):
					System.out.println("Please shoose animal : ");
					String pet4 ="Tom";
					Iterator iterator4 = zoo.map.keySet().iterator();
					while(iterator4.hasNext()) {
						Person pers =(Person) iterator4.next();
							animals.addAll(zoo.map.get(pers));
							for (int i = 0; i < animals.size(); i++) {
					            if (animals.get(i).name.equals(pet4)) {
					                animals.remove(i);
					            }
					        }
							zoo.map.put(pers, animals);
							System.out.println(zoo.map.get(pers));
							animals.removeAll(animals);	
					}
					break;
					
				case("outputZooclubOnScreen"):
					System.out.println("		Zooclub :");

					Iterator iterator5 = zoo.map.keySet().iterator();

					Iterator iterator6 = zoo.map.values().iterator();
					
					while(iterator5.hasNext()) {
						//System.out.print("Name of member is ");
						System.out.println(iterator5.next());
						System.out.print("Member's animals are  ");						
						System.out.println(iterator6.next());
					}
					break;
					
				case("exitFromProgram"):
					System.out.println("Good bye");
					System.exit(0);
					scan.close();
			}
			System.out.println();
		}
	}	
}
