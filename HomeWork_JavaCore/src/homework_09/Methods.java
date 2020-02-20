package homework_09;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int a;
			int b;
			int resultAdd;
			int resultMinus;
			int resultDevide;
			int resultMultiply;
			while (true) {
				System.out.println("Please enter two numbers");
				a=scanner.nextInt();
				b=scanner.nextInt();
				
				resultAdd=addTwoNumbers(a,b);
				resultMinus=minusTwoNumbers(a,b);
				resultDevide=devideTwoNumbers(a,b);
				resultMultiply=multiplyTwoNumbers(a,b);
				System.out.println("a+b="+resultAdd+", a-b="+ resultMinus+", a/b="+resultDevide+", a*b="+resultMultiply);
				
			}
		}
		catch(MyException ex){
			System.out.println(ex.getMessage());
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
		catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		catch(IllegalAccessException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	public static int addTwoNumbers(int a,int b) throws MyException, IllegalAccessException {
		if ((a<0)&(b<0)) {
			throw new IllegalArgumentException("Two numbers cannot be < 0");
		}
		if (((a==0)&(b!=0)) | ((a!=0)&(b==0))) {
			throw new ArithmeticException("One number cannot be 0 when another!=0");
		}
		if ((a==0)&(b==0)) {
			throw new IllegalAccessException("Two numbers cannot be 0");
		}
		if ((a>0)&(b>0)) {
			throw new MyException("Two numbers cannot be > 0");
		}
		return a+b;
	}
	
	public static int minusTwoNumbers(int a,int b) throws MyException, IllegalAccessException {
		if ((a<0)&(b<0)) {
			throw new IllegalArgumentException("Two numbers cannot be < 0");
		}
		if (((a==0)&(b!=0)) | ((a!=0)&(b==0))) {
			throw new ArithmeticException("One number cannot be 0 when another!=0");
		}
		if ((a==0)&(b==0)) {
			throw new IllegalAccessException("Two numbers cannot be 0");
		}
		if ((a>0)&(b>0)) {
			throw new MyException("Two numbers cannot be > 0");
		}
		return a-b;
	}

	public static int devideTwoNumbers(int a,int b) throws MyException, IllegalAccessException {
		if ((a<0)&(b<0)) {
			throw new IllegalArgumentException("Two numbers cannot be < 0");
		}
		if (((a==0)&(b!=0)) | ((a!=0)&(b==0))) {
			throw new ArithmeticException("One number cannot be 0 when another!=0");
		}
		if ((a==0)&(b==0)) {
			throw new IllegalAccessException("Two numbers cannot be 0");
		}
		if ((a>0)&(b>0)) {
			throw new MyException("Two numbers cannot be > 0");
		}
		return a/b;
	}
	
	public static int multiplyTwoNumbers(int a,int b) throws MyException, IllegalAccessException {
		if ((a<0)&(b<0)) {
			throw new IllegalArgumentException("Two numbers cannot be < 0");
		}
		if (((a==0)&(b!=0)) | ((a!=0)&(b==0))) {
			throw new ArithmeticException("One number cannot be 0 when another!=0");
		}
		if ((a==0)&(b==0)) {
			throw new IllegalAccessException("Two numbers cannot be 0");
		}
		if ((a>0)&(b>0)) {
			throw new MyException("Two numbers cannot be > 0");
		}
		return a*b;
	}
}
