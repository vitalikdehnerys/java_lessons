package homework_08;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		//checkMonth();
		//monthOfSeason();
		//numberOfDays();
		//lessNumberOfDays();
		//moreNumberOfDays();
		//nextSeason();
		//previousSeason();
		//monthWithPairNumberOfDays();
		//monthWithOddNumberOfDays();
		//checkOnPairDays();
	}
	
	public static void checkOnPairDays() {
		Scanner scanner = new Scanner(System.in);
		String s;
		while(true) {
			System.out.println("Please enter month");
			s=scanner.next();
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
	
	public static void monthWithOddNumberOfDays() {
		System.out.println("Month with odd number of days:");
		for(Month a :Month.values()) {
			if(a.numberOfDay%2==1) {
				System.out.println(a.name());
			} 
		}
	}
	
	public static void monthWithPairNumberOfDays() {
		System.out.println("Month with pair number of days:");
		for(Month a :Month.values()) {
			if(a.numberOfDay%2==0) {
				System.out.println(a.name());
			} 
		}
	}
	
	public static void previousSeason() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month :");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfSeason;
					System.out.print("Previous season is : ");
					
					if(k==0) {
						System.out.println(Season.AUTUMN.toString());
					}
					else {
						for(Season b :Season.values()) {
							if(k==b.ordinal()+1) {
								System.out.println(b.toString());
								break;
							}
						}
					}
				}
			}
		} 
	}
	
	public static void nextSeason() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month :");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfSeason;
					System.out.print("Next season is : ");
					
					if(k==3) {
						System.out.println(Season.WINTER.toString());
					}
					else {
						for(Season b :Season.values()) {
							if(k==b.ordinal()-1) {
								System.out.println(b.toString());
								break;
							}
						}
					}
				}
			}
		} 
	}
	
	public static void moreNumberOfDays() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month :");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfDay;
					System.out.println("In this month number of days more than :");
					for(Month b :Month.values()) {
						if(k>b.numberOfDay) {
							System.out.println(b.toString());
						}
					}
				}
			} 
		}
	}
	
	public static void lessNumberOfDays() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month :");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfDay;
					System.out.println("In this month number of days less than :");
					for(Month b :Month.values()) {
						if(k<b.numberOfDay) {
							System.out.println(b.toString());
						}
					}
				}
			} 
		}
	}
	
	public static void numberOfDays() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfDay;
					System.out.println("In this month number of days the same as  :");
					for(Month b :Month.values()) {
						if(k==b.numberOfDay) {
							System.out.println(b.toString());
						}
					}
				}
			} 
		}
	}
	
	public static void monthOfSeason() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k=0;
		while(true) {
			System.out.println("Please enter month");
			s=scanner.next();
			
			for(Month a :Month.values()) {
				if(s.equalsIgnoreCase(a.toString())) {
					k=a.numberOfSeason;
					System.out.println("Month with the same season:");
					for(Month b :Month.values()) {
						if(k==b.numberOfSeason) {
							System.out.println(b.toString());
						}
					}
				}
			} 
		}
	}
	
	public static void checkMonth() {
		Scanner scanner = new Scanner(System.in);
		String s;
		int k = 0;
			
		while(true) {
			System.out.println("Please enter month");
			s=scanner.next();
			
			for(Month a :Month.values()) {
		
				if(s.equalsIgnoreCase(a.toString())) {
					k=1;
					break;
				}else {
					k=0;
				}
			}
			if(k==1) {
				System.out.println("Great");
			}
			else {
				System.out.println("Bad,very bad");
			}  
		}
	}
	
}

