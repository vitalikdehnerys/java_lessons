package homework_08;

import java.util.Scanner;
public class Aplication_2 {

	public static void main(String[] args) {
		
		//checkTwoNumbers(); //exersize 3 homework_8
		//checkNumber(); //exersize 2 homework_8
	}
	
	public static void checkNumber() {
		Scanner scanner = new Scanner(System.in);
		Integer i=null;
		while(true) {
			System.out.println("Enter number");
				
				i=scanner.nextInt();
				
				if(i%2==0) {
					System.out.println("You input number :"+i);
					System.out.println("This number is pair");
				}else {
					System.out.println("You input number :"+i);
					System.out.println("This number is odd");
				}
		}	
	}


	public static void checkTwoNumbers() {
		Scanner scanner = new Scanner(System.in);
		Integer i=null;
		Integer k=null;
		Integer t=null;
		while(true) {
			System.out.println("Enter two numbers");
				
				i=scanner.nextInt();
				k=scanner.nextInt();
				t=i+k;
				System.out.println("Sum of two  numbers ="+ t);
		}	
	}
	
}