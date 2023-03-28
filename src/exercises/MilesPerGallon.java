package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("How many miles did you drive: ");
        double miles= input.nextDouble();

        System.out.println("How many gallons of gas did you use: ");
        double gas= input.nextDouble();

        double mpg=miles/gas;
        System.out.println("Your car got "+mpg+"miles per gallon.");
    }
}
