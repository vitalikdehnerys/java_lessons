package homework_14;
import java.util.Comparator;

public class Sortbyversion implements Comparator<IPhone> {

	@Override
	public int compare(IPhone arg1, IPhone arg2) {
		// TODO Auto-generated method stub
		return arg1.version-arg2.version;
	}

}
