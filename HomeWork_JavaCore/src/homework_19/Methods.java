package homework_19;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Methods {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Vitalik",12345,10000);
		Employee employee0=null;
		
		serealize(employee,"file");
		deSerealize(employee0, "file");

		System.out.println("serealization for collection");
		
		Employee [] employeeArr = {new Employee("Vitalik",10001,10000),new Employee("Sofia",10002,21000),
				new Employee("Bodya",10003,13000),new Employee("Lubomur",10004,17000),
				new Employee("Sviatoslav",10006,30000)};
		
		List<Employee> listEmployee =new ArrayList<>(Arrays.asList(employeeArr));
		List<Employee> listEmployee1 =new ArrayList<Employee>(listEmployee.size());
		
		serealizeArray(listEmployee, "fileforArray");
		deSerealizeArray(listEmployee1, "fileforArray");
	}
	
	public static void serealize(Employee em1,String filename) {
		try{    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(em1); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        }catch(IOException ex){ 
            System.out.println("IOException is caught"); 
        }
	}
	
	public static void deSerealize(Employee object1,String filename) {

        try{    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (Employee)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println(object1);
        }catch(IOException ex){ 
            System.out.println("IOException is caught"); 
        }catch(ClassNotFoundException ex){ 
            System.out.println("ClassNotFoundException is caught"); 
        }
	}

	//methods for array
	
	public static void serealizeArray(List<Employee> list,String filename) {
        try{    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(list); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Collection have been serialized"); 
        }catch(IOException ex){ 
            System.out.println("IOException is caught"); 
        }
	}
	
	public static void deSerealizeArray(List<Employee> array,String filename) {
		
		try{    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            array = (List<Employee>)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Collection have been deserialized "); 
            array.forEach(empl->System.out.println(empl));
        }catch(IOException ex){ 
            System.out.println("IOException is caught"); 
        }catch(ClassNotFoundException ex){ 
            System.out.println("ClassNotFoundException is caught"); 
        }
	}
	
}
