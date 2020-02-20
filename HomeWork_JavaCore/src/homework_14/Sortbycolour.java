package homework_14;
import java.util.Comparator;

public class Sortbycolour implements Comparator<IPhone> {

	@Override
	public int compare(IPhone o1, IPhone o2) {
		// TODO Auto-generated method stub
		return o1.colour.compareTo(o2.colour);
	}

}
