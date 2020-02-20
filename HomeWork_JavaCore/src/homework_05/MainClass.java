package homework_05;
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Max value Float ="+Float.MAX_VALUE);
		System.out.println("Min value Float ="+Float.MIN_VALUE);
		System.out.println("Max value Double ="+Double.MAX_VALUE);
		System.out.println("Min value Double ="+Double.MIN_VALUE);
		
		Amphibia frog = new Frog();
		
		frog.Eat();
		frog.Sleep();
		frog.Walk();
		frog.Sweam();	
	}

}
