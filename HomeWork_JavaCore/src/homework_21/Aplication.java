package homework_21;

import java.lang.reflect.Field;

public class Aplication {

	public static void main(String[] args) {
		Key key = new Key();
		checkDoesFieldHasAnotation(key);
	}

	public static void checkDoesFieldHasAnotation(Key key) {
		Field [] fields =key.getClass().getDeclaredFields();
		
		for(Field field:fields) {
			if(field.isAnnotationPresent(BadCode.class)) {
				System.out.println(field);
			}
		}
	}
}
