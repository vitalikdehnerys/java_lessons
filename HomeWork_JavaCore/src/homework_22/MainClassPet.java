package homework_22;

import java.util.ArrayList;
import java.util.List;

public class MainClassPet {

	public static void main(String[] args) {
		List<Pet> pet =new ArrayList<Pet>() ;
		Pet cat = new Cat();
		Pet dog = new Dog();
		Pet cow = new Cow();
		
		pet.add(cat);
		pet.add(cow);
		pet.add(dog);
		
		pet.forEach(e->e.voice());
		
			
	}
}