package homework_13;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Faction implements Comparable<Faction>  {
	Set<Deputat> depututes =new TreeSet<>();
	
	public Faction(){}
	
	public void addDeputat() {
		Scanner scanner = new Scanner(System.in);
		String name=scanner.next();
		String surname = scanner.next();
		int age =scanner.nextInt();
		boolean takeBribe =scanner.nextBoolean();
		int weight =scanner.nextInt();
		int height =scanner.nextInt();
		Deputat dep = new Deputat(name, surname, age, takeBribe, weight, height);
		depututes.add(dep);
		scanner.close();
	}
		
	public void deleteDeputat(Deputat dep) {
		Iterator<Deputat> iter = depututes.iterator();
		while(iter.hasNext()) {
			Deputat deputat =iter.next() ;
			if(deputat.equals(dep)) {
				iter.remove();
			}
		}
		
	}
	
	public void printAllCoruptionists() {
		System.out.println("List of coruptionist : ");
		for(Deputat dep:depututes) {
			if(dep.isCorruptionist()) {
				System.out.println(dep);
			}
		}
	}
	
	public void printTheBiggestCoruptionist() {
		int maxBride=0;
		Deputat depWithTheBiggestBride=new Deputat();
		System.out.print("The Biggest Coruptionist is ");
		for(Deputat dep:depututes) {
			if(dep.isCorruptionist()) {
				if(dep.sizeOfBride>maxBride) {
					depWithTheBiggestBride=dep;
					maxBride=dep.sizeOfBride;
				}
			}
		}
		System.out.println(depWithTheBiggestBride);
	}
	
	public void printAllDep() {
		for(Deputat dep:depututes) {
			System.out.println(dep);
		}
	}
	
	public void deleteAllDep() {
		depututes.clear();
	}

	@Override
	public String toString() {
		return "Faction [depututes=" + depututes + "]";
	}

	@Override
	public int compareTo(Faction o) {
		int result =-1; 
		Iterator<Deputat> it =depututes.iterator();
		Iterator<Deputat> itO = o.depututes.iterator();
		while(it.hasNext()&itO.hasNext()) {
			if(it.next().equals(itO.next())) {
				result =1;
			}
		}
		return result;
	}
	
	
}
