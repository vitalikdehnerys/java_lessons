package homework_24;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Schedule {
	Set<Seance> seances = new TreeSet<>();
	
	public Schedule() {}
	
	public void addSeanceToSet(Seance seance) {
		seances.add(seance);
	}
	
	public void removeSeanceFromSet(Seance seance) {
		Iterator<Seance> iter = seances.iterator();
		while(iter.hasNext()) {
			Seance sean =iter.next() ;
			if(sean.equals(seance)) {
				iter.remove();
			}
		}
	}

	@Override
	public String toString() {
		return "seances : " + seances+"\n";
	}	
	
}
