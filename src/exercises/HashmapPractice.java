package exercises;
import org.w3c.dom.ls.LSInput;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> students= new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID number: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        System.out.println("\nClass Roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}
