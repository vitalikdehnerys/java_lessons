package homework_17;

public class Aplication {

	public static void main(String[] args) {
		Number [] arrayOfNumber = {1,2,6,7,8,3,4,5,7,9,10,11,12,13,14,1,5,37,18,19,20,21,22,23,24,25};
		Collection collectionFirst= new Collection(arrayOfNumber);
		Collection collectionSecond= new Collection(arrayOfNumber);
		Collection collectionSt= new Collection(arrayOfNumber);
		
		
		try{
			// first exercise from homework 17
			while(collectionFirst.colection_1.hasNext()) {
				collectionFirst.colection_1.next();
			}
			//second exercise from homework 17
			while(collectionSecond.colection_2.hasNext()) {
				collectionSecond.colection_2.next();
			}
			// third exercise from homework 17
			while(collectionSt.colectionSt.hasNext()) {
				collectionSt.colectionSt.next();			
			}
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("End of array");
		}
	}
}






