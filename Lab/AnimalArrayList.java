package lab5;

public class AnimalArrayList implements AnimalList {
	private Animal[] arrayList;
	private int size;
	public AnimalArrayList() {
		arrayList = new Animal[10];
	}
	public AnimalArrayList(int initSize) {
		arrayList = new Animal[initSize];
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	private void copyElementsFrom(Animal[] oldElements) {
		if(oldElements == null) {
			arrayList = new Animal[0];
		}
		else {
			arrayList = new Animal[oldElements.length];
			for(int i = 0; i < oldElements.length; i++) {
				arrayList[i] = oldElements[i];
				if(arrayList[i] != null) {
					size++;
				}
			}
		}
	}
	
	private void checkSize(int needCapacity) {
		if (needCapacity > arrayList.length || size >= arrayList.length * 0.7) {
            Animal[] newElements = new Animal[arrayList.length * 2];
            copyElementsFrom(arrayList);
		}
	}
	
    public boolean add(Animal element) {
        checkSize(size + 1);
        arrayList[size] = element;
        size++;
        return true;
    }

    public void set(int index, Animal element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        arrayList[index] = element;
    }

    public Animal get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return arrayList[index];
    }

    public void clear() {
        arrayList = new Animal[10];
        size = 0;
    }

    public String toString() {
        if (isEmpty()) {
            return "AnimalArrayList is empty";
        }
        String s = "[";
        for(int i = 0; i < size; i++) {
        	s += arrayList[i];
        	if (i < size - 1) {
                s += ", ";
            }
        }
        return s;
    }
    
	
	
	
}
