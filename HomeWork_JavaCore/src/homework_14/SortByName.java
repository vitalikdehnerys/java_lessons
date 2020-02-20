package homework_14;

import java.util.Comparator;

public class SortByName implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		// TODO Auto-generated method stub
		return o1.name.compareToIgnoreCase(o2.name);
	}

}
