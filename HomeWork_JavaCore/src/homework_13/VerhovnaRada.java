package homework_13;

import java.util.Set;
import java.util.TreeSet;

public class VerhovnaRada {
	private static VerhovnaRada single_instance=null;
	Set<Faction> factions = new TreeSet<>();
	
	private VerhovnaRada(){}
	
	public static VerhovnaRada getInstance() {
		if(single_instance==null) {
			single_instance= new VerhovnaRada();
		}
		return single_instance;
	}
	
	public void clearTheFaction(Faction fac) {
		fac.deleteAllDep();
	}
	
	public void addFaction(Faction fac) {
		factions.add(fac);
	}
	
	public void deleteFaction(Faction fac) {
		factions.remove(fac);
	}
	
	public void printAllFaction() {
		for(Faction fac:factions) {
			System.out.println(fac);
		}
	}
	
	public void printFaction(Faction fac) {
		System.out.println(fac);
	}
	
	public void addDepToFaction(Faction fact) {
		fact.addDeputat();
	}
	
	public void deleteDepFromFaction(Deputat dep, Faction fact) {
		fact.deleteDeputat(dep);
	}
	
	public void printAllCorupFromFaction(Faction fact) {
		fact.printAllCoruptionists();
	}
	
	public void PrintTheBiggestCoruFromFaction(Faction fact) {
		fact.printTheBiggestCoruptionist();
	}
	
	public void printAllDepFromFaction(Faction fact) {
		fact.printAllDep();
	}
	
}
