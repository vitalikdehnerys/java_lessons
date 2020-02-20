package homework_18;

import java.util.Arrays;

public class Map<K,V> {
	private static final int CAPACITY = 10;
	private int size = 0;
	protected Object  key [];
	protected Object  value [] ;
	
	public Map() {
		key = new Object[CAPACITY];
		value = new Object[CAPACITY];
	}
	
	public void add(K ke,V val) {
		if (size == key.length) {
			ensureCapacity(); 
		}
		key[size] = ke;
		value[size++] = val;
	}
	
	//this method remove element for the key
	public K removeForKey(K ke) {
		Object removedKey = ke;
		int index =0;
		while(!key[index].equals(ke)) {
			index++;
		}
		for (int j=index; j < size; j++) {
			key[j]=key[j+1];
			value[j]=value[j+1];
			key[size]=null;
			value[size]=null;
		}
		return (K)removedKey;
	}
	
	//this method remove element for the value 
	public V removeForValue(V val) {
		Object removedValue = val;
		int index=0;
		while(!value[index].equals(val)) {
			index++;
		}
		for (int j=index; j < size-1; j++) {
			key[j]=key[j+1];
			value[j]=value[j+1];
			size--;
			key[size]=null;
			value[size]=null;	
		}
		return (V)removedValue;
	}
	
	//This method output on Screen set of keys
	public void outputSetKey() {
		int index =0;
		System.out.print("Set key : ");
		while(key[index]!=null) {
			System.out.print(key[index]+" ; ");
			index++;
		}
		System.out.println();
	}
	
	//This method output on Screen list of values
	public void outputListValue() {
		int index =0;
		System.out.print("List value : ");
		while(value[index]!=null) {
			System.out.print(value[index]+" ; ");
			index++;
		}
		System.out.println();
	}
	
	//This method output on Screen all a map
	public void outputMap() {
		int index =0;
		System.out.println("Map : ");
		while(key[index]!=null) {
			System.out.println("key = "+key[index]+" , value = "+value[index]+" . ");
			index++;
		}
		System.out.println();
	}	
	
	private void ensureCapacity() {
		int newIncreasedCapacity = key.length *2;
		key = Arrays.copyOf(key, newIncreasedCapacity);
		value = Arrays.copyOf(value, newIncreasedCapacity);
	}

	@Override
	public String toString() {
		return "Map [key=" + Arrays.toString(key) + ", value=" + Arrays.toString(value) + "]";
	}
}