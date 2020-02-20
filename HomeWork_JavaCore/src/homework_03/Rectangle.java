package homework_03;

public class Rectangle {
	
	private int length;
	private int width;
	
	// Constructor without parameters
	public Rectangle() {
		this.length=10;
		this.width=5;
	}

	// Constructor with parameters
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
		
	}
	
	// method which return rectangle's area
	public static int Area(int a,int b) {
		int c=a*b;
		return c;
	}
	
	// method which return rectangle's perimetr
	public static int Perimetr(int a,int b) {
		int c=(a+b)*2;
		return c;
	}
	
	public static void main(String[] args) {
		
		Rectangle first = new Rectangle(); // creating object uses conctructor without parameters
		Rectangle second = new Rectangle(20,10); // creating object uses conctructor with parameters

		
		System.out.println("Rectangle's area first= "+Area(first.length,first.width)+", rectangle's perimetr first ="+Perimetr(first.length,first.width));
		System.out.println("Rectangle's area second= "+Area(second.length,second.width)+", rectangle's perimetr second ="+Perimetr(second.length,second.width));
		
	}

}
