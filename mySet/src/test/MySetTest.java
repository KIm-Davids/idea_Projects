package test;

import static org.junit.jupiter.api.Assertions.*;

import MyCollection.MySet;
import org.junit.jupiter.api.Test;

public class MySetTest {

    MySet set = new MySet();

    @Test
    public void testThatMySetIsEmpty(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatMySetCanAddItem(){
        set.add(10);
        set.add(5);
        assertEquals(2, set.size());
    }

    @Test
    public void testThatMySetCanReturnItems(){
        set.add(5);

        assertEquals(5, set.get(0));
    }

    @Test
    public void testThatMySetCanRemoveItems(){
        set.add("Ebuka");
        set.add("mfon");
        set.remove("Ebuka");
        assertEquals(1,set.size());
    }

    @Test
    public void testThatMySetDoesNotAddDuplicateValues(){
        set.add("Ebuka");
        set.add("mfon");
        set.add("mfon");
        assertEquals(null, set.get(2));
    }

    @Test
    public void testThatICanGetTheIndexOfAnElementInTheList(){

    }


}
