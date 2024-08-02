package MyCollection;

import javax.management.ObjectName;
import java.util.Arrays;

public class MyArrayList implements MyCollection{

    private boolean isEmpty = true;
    private int size;
    private int capacity = 3;
    Object[] myArrayList = new Object[capacity];

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object e) {
        myArrayList[size++] = e;
        increaseCapacity();
    }

    @Override
    public void remove(Object e) {
        for (Object itemsInList : myArrayList) {
            if (itemsInList.equals(e)) {
                Object removedElement = itemsInList;
                break;
            }
        }
        size--;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Invalid Index" + index);
        return myArrayList[index];
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object[] clear() {
        this.size = 0;
        Object[] newArray = new Object[capacity];
        return newArray;
    }

    public Integer findIndexOf(String element) {
        for(int counter = 0; counter < myArrayList.length; counter++){
            if(element.equals(myArrayList[counter])) return counter;
        }
        return 0;
    }

    @Override
    public void increaseCapacity() {
        if(capacity ==3) {
            int newCapacity = (myArrayList.length * 3) / 2;
            myArrayList = Arrays.copyOf(myArrayList, newCapacity);
        }
    }

    @Override
    public boolean contains(Object e) {
        if (myArrayList != null) {
            for(Object itemsInList : myArrayList) {
                if (itemsInList.equals(e)) return true;
            }
        }
        return false;
    }
}
