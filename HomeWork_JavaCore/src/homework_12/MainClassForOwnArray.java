package homework_12;

public class MainClassForOwnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OwnArrayList<String> ownArray = new OwnArrayList();
		
		ownArray.add("Vitalik");
		ownArray.add("Svaytoslav");
		ownArray.add("Sofia");
		ownArray.add("Lubomyr");
		ownArray.add("Bodya");
		
		System.out.println(ownArray);
		ownArray.remove(1);
		System.out.println(ownArray);
		ownArray.remove(1);
		System.out.println(ownArray);	
	
	}
	

}
