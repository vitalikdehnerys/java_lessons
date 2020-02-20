package homework_08;

import java.util.Scanner;

public class TestWrongInput {

	public static void main (String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String s;
			while(true) {
				System.out.println("Please enter month");
				s=scanner.next();
				inputParameters (s);
				for(Month a :Month.values()) {
					if(s.equalsIgnoreCase(a.toString())) {
						if(a.numberOfDay%2==0) {
							System.out.println("Month has got pair number`s of days");
						}
						else {
							System.out.println("Month has got odd number`s of days");
						}
					}
				}  
			}
		}
		catch(WrongInputConsoleParametersException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	

	public static void inputParameters(String s)throws WrongInputConsoleParametersException {
		if (s.length()<4) {
			throw new WrongInputConsoleParametersException("You input wrong parameters!");
		}
	}
}
