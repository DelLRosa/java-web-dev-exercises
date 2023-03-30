package exercises;
import java.util.ArrayList;
public class ArrayListSumMethod {
    public static int sumEven(ArrayList<Integer> arr) {
        int total=0;
        for (int num: arr){
            if (num%2==0){
                total+=num;
            }
        }
        return total;
    }

}
