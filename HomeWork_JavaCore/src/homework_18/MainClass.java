package homework_18;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Map();
		
		map.add("person1", 1);
		map.add("person2", 2);
		map.add("person3", 3);
		map.add("person4", 4);
		map.add("person5", 5);
		System.out.println(map.removeForKey("person1"));
		System.out.println(map.removeForValue(3));
		map.outputSetKey();
		map.outputListValue();
		map.outputMap();
	}
	
}
