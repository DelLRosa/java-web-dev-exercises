package org.launchcode.java.studios.countingchars;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingChars {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence for us to count: ");
        String userString=input.nextLine();
        String alphaString=removeNonAlphaNumeric.removeAllNonAlphaNumeric(userString);

        String bigString="If the product of two terms is zero then common sense says at least one of the two terms has" +
                " to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done" +
                " that, it’s pretty straightforward from there.";
//        char[] charactersInString = bigString.toCharArray();
//        System.out.println(removeNonAlphaNumeric.removeAllNonAlphaNumeric(bigString));
        
        char[] charactersInString = alphaString.toLowerCase().toCharArray();
        System.out.println(charactersInString);

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char letter: charactersInString) {
//            System.out.println(letter);
            if (!charCount.containsKey(letter)){
//                int value =1;
                charCount.put(letter,1);
            } else {
                int updateValue=charCount.get(letter);
                charCount.put(letter, updateValue+1);
            }
        }
        for (Map.Entry<Character, Integer> letter: charCount.entrySet()) {
            System.out.println(letter.getKey()+ " :"+letter.getValue());
        }


    }
}
