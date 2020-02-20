package homework_18;

import java.util.ArrayList;
import java.util.List;

public class AddStringToInteger {
	  
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		Integer a=1;
		num.add(a);
		for (String s : args) {
		    int neki = Integer.parseInt(s);
		    num.add(neki);
		}
		System.out.println(num);
	}
}