import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MrChineduTest {

    MrChinedu addNextIndex = new MrChinedu();

    @Test
    public void testThatTheAddNumberOfTheNextIndexWorks(){
        int[] expectToBe = {7,5,5};
        int[] passInArray = {2,5,4,1,2,3};
        assertArrayEquals(expectToBe, MrChinedu.addNumberOfTheNextIndex(passInArray));
    }

    @Test
    public void testThatTheAddNumberOfTheNextIndexWorksSecondArray(){
        int[] expectToBe = {6,5,6};
        int[] passInArray = {1,5,3,2,3,3};
        assertArrayEquals(expectToBe, MrChinedu.addNumberOfTheNextIndex(passInArray));
    }
}
