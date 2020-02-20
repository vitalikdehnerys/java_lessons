package homework_17;

public class LocalClass {

	public static void main(String[] args) {
		Number [] arrayOfNumber = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		Collection collection= new Collection(arrayOfNumber);
		
		checkEachFiveNumber(collection);
	}
	
	public static void checkEachFiveNumber(Collection collection) {
		
		class  CollectionFour implements Iterator {
			int counterFour=0;
			public Number[] arr;
			
			public CollectionFour(Number[] arrr) {
				this.arr=arrr;
			}
			
			@Override
			public boolean hasNext() {
				if(counterFour>arr.length) {
					return false;
				}
				return true;
			}

			@Override
			public void next() {
				System.out.println(arr[counterFour]);
				if(((int)arr[counterFour]%2)==0){
					System.out.println(arr[counterFour]);
				arr[counterFour]=(int)arr[counterFour]-100;
				System.out.println(arr[counterFour]);
				}
				counterFour+=5;
			}
		}
		
		CollectionFour colle=new CollectionFour(Collection.array);
		try {
			while(colle.hasNext()) {
				colle.next();
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("End of array");
		}
	}
}
