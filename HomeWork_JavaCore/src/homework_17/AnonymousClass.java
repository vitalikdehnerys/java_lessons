package homework_17;

public class AnonymousClass {

	public static void main(String[] args) {
		
		Number [] arrayOfNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		Collection collection= new Collection(arrayOfNumber);
		
		Iterator iter = new Iterator() {

			public int counter=0;
			@Override
			public boolean hasNext() {
				if(counter+collection.array.length-1>=0) {
					return true;
				}
				return false;
			}

			@Override
			public void next() {
				if(((int)collection.array[counter+collection.array.length-1])%2==1) {
					System.out.println(collection.array[counter+collection.array.length-1]);
				}
				counter--;
				counter--;
				counter--;
			}
		};
		
		while(iter.hasNext()) {
			iter.next();
		}
	}

}
