package homework_15;

import java.util.List;
import java.util.Map;

public class ZooClub {
	Map<Person,List<Animal>> map;
	
	public ZooClub() {}
	
	public ZooClub(Map<Person,List<Animal>> map) {
		this.map=map;
	}

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "ZooClub [map=" + map +"]";
	}
	
	
}
