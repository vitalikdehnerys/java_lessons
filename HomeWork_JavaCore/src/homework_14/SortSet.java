package homework_14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SortSet {

	public static void main(String[] args) {
		
		HashSet<IPhone> setIPhone = new LinkedHashSet<>();
		
		setIPhone.add(new IPhone("red",7));
		setIPhone.add(new IPhone("white",8));
		setIPhone.add(new IPhone("dark",9));
		setIPhone.add(new IPhone("yellow",10));
		setIPhone.add(new IPhone("blue",7));
		setIPhone.add(new IPhone("green",6));
		setIPhone.add(new IPhone("brown",8));
		
		Iterator<IPhone> iphoneIterator =setIPhone.iterator(); 
		System.out.println("Not sorted set");
		while(iphoneIterator.hasNext()) {
			System.out.println(iphoneIterator.next());
		}
		
		List<IPhone> listIPhone = new ArrayList<IPhone>(setIPhone);
		Collections.sort(listIPhone,new Sortbyversion());
		Collections.sort(listIPhone,new Sortbycolour());
		setIPhone = new LinkedHashSet<>(listIPhone);
		
		Iterator<IPhone> iphoneIterator2 =setIPhone.iterator(); 
		System.out.println("Sorted set");
		while(iphoneIterator2.hasNext()) {
			System.out.println(iphoneIterator2.next());
		}
	}
}