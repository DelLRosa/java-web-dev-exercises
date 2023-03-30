package exercises;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sumEven=ArrayListSumMethod.sumEven(numbers);
        System.out.println(sumEven);
        ArrayList<String> words=new ArrayList<>();
        words.add("asdfghj");
        words.add("eyuio");
        words.add("hfdasjkkl");
        words.add("asdfw");
        words.add("boobs");
        words.add("buttss");
        words.add("posie");

        ArrayListWordMethod.printWord(words);

    }
}
