package homework_17;

public class Collection {
	static public Number[] array;
	Collection1 colection_1=new Collection1();
	Collection2 colection_2=new Collection2();
	CollectionSt colectionSt=new CollectionSt();	
	
	public Collection(Number[] array) {
		Collection.array=array;
	}

				// first exercise from homework 17
			class Collection1 implements Iterator {
				public int counterNext=0;
				public Collection1() {};
				
				@Override
				// додати лічильникв некст і при збільшенні 
				public boolean hasNext() {
					if(counterNext>array.length ) {
						return false;
					}
					return true;
				}

				@Override
				public void next() {
					if ((counterNext+1)%2==1) {   // we check that i is odd or even
						array[counterNext]=0;
					}
					System.out.println(array[counterNext] );
					counterNext++;
				}	
			}
			
			//second exercise from homework 17
			class Collection2 implements Iterator{
				public int counterNex=0;
				
				public Collection2() {};
				@Override
				public boolean hasNext() {
					if(counterNex+array.length-1>=0) {
						return true;
					}
					return false;
				}
	
				@Override
				public void next() {
					System.out.println(array[counterNex+array.length-1] );
					counterNex--;
					counterNex--;
				}	
			}
			
			//fifth exercise from homework 17
			static class CollectionSt implements Iterator {
				static int counterFour=0;
				public CollectionSt() {};
				
				@Override
				public boolean hasNext() {
					if(counterFour>array.length) {
						return false;
					}
					return true;
				}
		
				@Override
				public void next() {
					if(((int)array[counterFour]%2)==0){
						System.out.print(array[counterFour]+" changed on - ");
						array[counterFour]=(int)array[counterFour]-1;
						System.out.println(array[counterFour]);
					}
					counterFour+=2;
				}
			}			
}
