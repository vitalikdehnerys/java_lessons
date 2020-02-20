package homework_14;

import java.util.Comparator;

public class SortByLength implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		// TODO Auto-generated method stub
		return o1.length-o2.length;
	}

}
