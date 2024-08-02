package test;

import static org.junit.jupiter.api.Assertions.*;

import MyCollection.MyArrayList;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {

    MyArrayList myArrayList = new MyArrayList();

    @Test
    public void testThatMyArrayListIsEmpty(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatMyArrayListCanAdd(){
        myArrayList.add("ebuka");
        myArrayList.add("mfon");
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testThatMyArrayCanRemoveValues(){
        myArrayList.add("ebuka");
        myArrayList.add("mfon");
        myArrayList.add("mfon");
        myArrayList.remove("ebuka");
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testThatmyArrayListSizeMethodWorks(){
        myArrayList.add("mfon");
        myArrayList.add("tomi");
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testThatMyArrayCanRetrieveValuesFromList(){
        myArrayList.add("ebuka");
        myArrayList.add("mfon");
        assertEquals("ebuka", myArrayList.get(0));
    }

    @Test
    public void testThatMyArrayListCanFindValuesByIndex(){
        myArrayList.add("ebuka");
        myArrayList.add("mfon");
        assertEquals(1, myArrayList.findIndexOf("mfon"));
    }

    @Test
    public void testThatMyArrayListCanIncreaseInCapacity(){
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(5);
        assertEquals(5, myArrayList.size());
    }

    @Test
    public void testThatMyArrayCanRemoveElementFromList(){
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        myArrayList.remove(1);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testThatMyArrayListContainsMethodWorks(){
        myArrayList.add(1);
        myArrayList.add(3);

        assertTrue(myArrayList.contains(3));
    }

    @Test
    public void testThatMyArrayListClearMethodWorks(){
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(4);

        myArrayList.clear();

        assertEquals(0, myArrayList.size());
    }
}
