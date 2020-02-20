package homework_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Aplication {

	public static void main(String[] args) {
		
		//min
		
		House house = new House(20,50,5,"white"); 
		
		try {
			Class targetClass  = Class.forName("homework_16.House");
			
			Field  [] fields = targetClass.getDeclaredFields();
			
			System.out.println("House class fields : ");
			for (Field field:fields) {
				int modifier = field.getModifiers();
				System.out.println(modifier);
				System.out.println(field);
			}
			
			System.out.println("House class methods : ");
			Method [] methods = targetClass.getDeclaredMethods();
			for (Method method:methods) {
				System.out.println(method);
			}
			
			Constructor [] constructors =targetClass.getConstructors();
			System.out.println("House class constructors : ");
			for(Constructor constructor:constructors) {
				System.out.println(constructor);	
			}
			
		}catch(ClassNotFoundException ex) {
			System.out.println("Class not found!!!");
		}
		System.out.println();
		
		//max
		
		try {
			Class targetClass =Class.forName("homework_16.House");
			
			Method method1=targetClass.getMethod("setArea",int.class);
			method1.invoke(house, 100);
			System.out.println("Houses area equals: " + house.getArea());
			
			Method method2=targetClass.getMethod("myMethod", String.class);
			Method method3=targetClass.getMethod("myMethod", String.class,int.class,int.class,int.class);
			System.out.println(method2);
			System.out.println(method3);
		}catch(Exception ex){
			System.out.println("You did mistake");
		}
	}
}
