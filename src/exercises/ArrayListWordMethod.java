package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWordMethod {
    public static void printWord(ArrayList<String> arr) {
        Scanner input= new Scanner(System.in);
        System.out.println("Input word length: ");
        int userInput= input.nextInt();
        for (String word : arr ){
            if (word.length()==userInput){
                System.out.println(word);
            }
        }
    }
}
