package homework_21;

import java.lang.reflect.Field;

public class Key {
	@BadCode(type = TypeBadCode.BAD)
	int length;
	int weight;
	@BadCode(type = TypeBadCode.WORSE)
	int width;
	String colour;
	@BadCode(type = TypeBadCode.THEWORST)
	String material;
	public Key() {}
	
	public Key(int length,int weight,int width,String colour,String material) {
		this.colour=colour;
		this.length=length;
		this.material=material;
		this.weight=weight;
		this.width=width;
	}
	

}
