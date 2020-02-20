package homework_05;
public class MainClass5 {

	public static void main(String[] args) {
		Pet [] pet =new Pet[3];
		Pet cat = new Cat();
		Pet dog = new Dog();
		Pet cow = new Cow();
		
		pet[0]=cat;
		pet[1]=dog;
		pet[2]=cow;
		
		for (int i = 0; i < pet.length; i++) {
			pet[i].voice();
		}	
	}
}