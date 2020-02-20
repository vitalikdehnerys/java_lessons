package homework_14;

import java.util.Comparator;

public class SortByWidth implements Comparator<Commodity> {

	@Override
	public int compare(Commodity o1, Commodity o2) {
		// TODO Auto-generated method stub
		return o1.width-o2.width;
	}

}
