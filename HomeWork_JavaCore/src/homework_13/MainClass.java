package homework_13;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		VerhovnaRada verhRada=VerhovnaRada.getInstance();
		Faction fact = new Faction();
		Deputat dep =new Deputat(); 
		System.out.println("Enter 1 to add faction ");
		System.out.println("Enter 2 to delete the faction");
		System.out.println("Enter 3 to output all factions");
		System.out.println("Enter 4 to clear the faction");
		System.out.println("Enter 5 to output the faction");
		System.out.println("Enter 6 to add the deputat to the faction ");
		System.out.println("Enter 7 to delete the deputat to the faction");
		System.out.println("Enter 8 to output list of coruptionists");
		System.out.println("Enter 9 to output the biggest coruptionist");
		System.out.println("Enter 0 to exit");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter number : ");
			
			int number=sc.nextInt();
			switch(number) {
			
				case 1:
					verhRada.addFaction(fact);
					break;
				
				case 2:
					verhRada.deleteFaction(fact);
					break;
					
				case 3:
					verhRada.printAllFaction();
					break;
					
				case 4:
					verhRada.clearTheFaction(fact);
					break;
					
				case 5:
					verhRada.printFaction(fact);
					break;
					
				case 6:
					verhRada.addDepToFaction(fact);
					break;
					
				case 7:
					verhRada.deleteDepFromFaction(dep, fact);
					break;
					
				case 8:
					verhRada.printAllCorupFromFaction(fact);
					break;
					
				case 9:
					verhRada.PrintTheBiggestCoruFromFaction(fact);
					break;
					
				case 0:
					System.exit(0);
				
			}
			
		}

	}

}
