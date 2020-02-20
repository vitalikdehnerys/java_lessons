package homework_12;

import java.util.Arrays;

public class OwnArrayList<E> {
   // Define INITIAL_CAPACITY, size of elements of custom ArrayList
	private static final int INITIAL_CAPACITY = 10;
	private int size = 0;
	private Object elementData[] = {};
   
	public OwnArrayList() {
		elementData = new Object[INITIAL_CAPACITY];
	}
   
	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity(); 
		}
		elementData[size++] = e;
	}
   
	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size "+ index);
		}
		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--; 
		elementData[size]=null;
		return removedElement;
	}
   
	private void ensureCapacity() {
	int newIncreasedCapacity = elementData.length * 2;
	elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	}

	@Override
	public String toString() {
		return " elementData=" + Arrays.toString(elementData) + "  ";
	}
	
	
}

