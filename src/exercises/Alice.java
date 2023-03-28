package exercises;
import java.util.Scanner;
public class Alice {
    public static void main (String[] args){
        String sentence="Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner input=new Scanner(System.in);
        System.out.println("input word here: ");
        String word= input.nextLine();
        word=word.toLowerCase();

        int index;
        int length;
        String newSentence;

        if (sentence.contains(word)){
            System.out.println("The word "+word+" is contained in the sentence");
            index=sentence.indexOf(word);
            length=word.length();
            System.out.println("The index of "+word+" is "+index+" and its length is "+length);
            String modifiedSentence = sentence.replace(word, "");
            System.out.println(modifiedSentence);

        } else {
            System.out.println("The word "+word+" is not contained in the sentence");
        }
    }
}
