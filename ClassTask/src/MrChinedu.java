import java.util.ArrayList;
import java.util.Arrays;

public class MrChinedu {

    public static int[] addNumberOfTheNextIndex(int[] collectInput){
        int[] newArray = new int[3];

        for(int counter = 0; counter < collectInput.length - 1; counter+=2) {
                newArray[counter / 2] = collectInput[counter] + collectInput[counter + 1];
            }
            return newArray;
    }

    public static void main(String[] args) {
        int[] array = {2,5,4,1,2,3};
        System.out.println(Arrays.toString(addNumberOfTheNextIndex(array)));
    }

}
