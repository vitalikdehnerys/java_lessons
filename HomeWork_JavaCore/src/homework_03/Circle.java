package homework_03;

public class Circle {
	private double radius;
	private double diameter;
	
	//  Constructor with one parameter
	public Circle(double radius){
		
		this.radius=radius;
		this.diameter=radius*2;
		
	}
	
	// this method prints circle's area  
	public static void Area(double a) {
		double pi=3.14 ;
		double A;
		A=pi*(a/2)*(a/2); // circle's area
		System.out.println("Circle's area = "+A);
	} 
	
	// this method prints circle's length
	public static void Length(double a) {
		double pi=3.14 ; // число пі
		double L;
		L=2*pi*a; // circle`s length 
		System.out.println("Circle`s length = "+L);
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle(1);
		Area(circle1.diameter); // print circle`s area
		Length(circle1.radius); // print circle`s length
	}

}
