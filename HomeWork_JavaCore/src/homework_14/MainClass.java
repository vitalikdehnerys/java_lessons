package homework_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		HashSet<Commodity> comSet = new LinkedHashSet<>();
		Commodity commod1 = new Commodity("table",1,2,10);
		Commodity commod2= new Commodity("sofa",2,1,40);
		Commodity commod3 = new Commodity("wardrobe",2,2,50);
		Commodity commod4 = new Commodity("cupboard",2,3,20);
		Commodity commod5 = new Commodity("bed",3,2,32);
		
		comSet.add(commod1);
		comSet.add(commod2);
		comSet.add(commod3);
		comSet.add(commod4);
		comSet.add(commod5);
		
		Iterator<Commodity> iter = comSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter method :");
			String method=scanner.next();
			
			switch(method) {
			case("addCommodity"):
				System.out.println("Please enter name of a commodity");
				String commodName =scanner.next();
				System.out.println("Please enter length of a commodity");
				int commodLength =scanner.nextInt();
				System.out.println("Please enter width of a commodity");
				int commodWidth =scanner.nextInt();
				System.out.println("Please enter weigth of a commodity");
				int commodWeigth =scanner.nextInt();
				Commodity commod = new Commodity(commodName,commodLength,commodWidth,commodWeigth);
				comSet.add(commod);
				Iterator<Commodity> iter1 = comSet.iterator();
				while(iter1.hasNext()) {
					System.out.println(iter1.next());
				}
				break;
				
			case("deleteCommodity"):
				System.out.println("Please enter name of commodity which you want delete :");
				String nameOfCommod =scanner.next();
				Iterator<Commodity> iter2 = comSet.iterator();
				while(iter2.hasNext()) {
					if(iter2.next().name.equalsIgnoreCase(nameOfCommod)){
						iter2.remove();
					}
				}
				
				Iterator<Commodity> iter3 = comSet.iterator();
				while(iter3.hasNext()) {
					System.out.println(iter3.next());
				}
				break;
				
			case("changeCommodity"):
				System.out.println("Please enter name of commodity which you want change :");
				String nameChangeComm =scanner.next();
				Iterator<Commodity> iter4 = comSet.iterator();
				while(iter4.hasNext()) {
					Commodity commodChange=iter4.next();
					if(commodChange.name.equalsIgnoreCase(nameChangeComm)){
						System.out.println("Enter name of new commodity");
						commodChange.setName(scanner.next());
						System.out.println("Enter length of new commodity");
						commodChange.setLength(scanner.nextInt());
						System.out.println("Enter width of new commodity");
						commodChange.setWidth(scanner.nextInt());
						System.out.println("Enter weigth of new commodity");
						commodChange.setWeigth(scanner.nextInt());
					}
				}
				Iterator<Commodity> iter5 = comSet.iterator();
				while(iter5.hasNext()) {
					System.out.println(iter5.next());
				}
				break;
			
			case("sortByName"):
				List<Commodity> listCommodity1 = new ArrayList<Commodity>(comSet);
				Collections.sort(listCommodity1,new SortByName());
				comSet= new LinkedHashSet<>(listCommodity1);
				Iterator<Commodity> iter6 = comSet.iterator();
				while(iter6.hasNext()) {
					System.out.println(iter6.next());
				}
				break;
				
			case("sortByLength"):
				List<Commodity> listCommodity2 = new ArrayList<Commodity>(comSet);
				Collections.sort(listCommodity2,new SortByLength());
				comSet= new LinkedHashSet<>(listCommodity2);
				Iterator<Commodity> iter7 = comSet.iterator();
				while(iter7.hasNext()) {
					System.out.println(iter7.next());
				}
				break;			
				
			case("sortByWeigth"):
				List<Commodity> listCommodity3 = new ArrayList<Commodity>(comSet);
				Collections.sort(listCommodity3,new SortByWeigth());
				comSet= new LinkedHashSet<>(listCommodity3);
				Iterator<Commodity> iter8 = comSet.iterator();
				while(iter8.hasNext()) {
					System.out.println(iter8.next());
				}
				break;
				
			case("sortByWidth"):
				List<Commodity> listCommodity4 = new ArrayList<Commodity>(comSet);
				Collections.sort(listCommodity4,new SortByWidth());
				comSet= new LinkedHashSet<>(listCommodity4);
				Iterator<Commodity> iter9 = comSet.iterator();
				while(iter9.hasNext()) {
					System.out.println(iter9.next());
				}
				break;
				
			case("outputElement"):
				System.out.println("Please enter number which you want output:");
				String nameOfCommodity=scanner.next();
				Iterator<Commodity> iter10 = comSet.iterator();
				while(iter10.hasNext()) {
					Commodity commodOutput=iter10.next();
					if(commodOutput.name.equalsIgnoreCase(nameOfCommodity)){
						System.out.println(commodOutput);
					}
				}
				break;
				
			case("exit"):
				System.out.println("Good bye");
				System.exit(0);
			
			}
		}	
	}
}