package homework_05;
public class Frog extends Amphibia  {
	private int weight;
	private int age;
	private String types;
	
	public Frog() {}
	
	// overloaded constructors
	public Frog(String types,int age) {		
		this.types=types;
		this.age=age;
	}
	
	public Frog(String types,int age,int weight) {
		this(types,age);
		this.weight=weight;
	}	
}