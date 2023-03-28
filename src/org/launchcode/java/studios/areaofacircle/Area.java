package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double radius;
        do {
            System.out.println("Please enter a radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid radius!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        double area=Circle.getArea(radius);
        System.out.println("The area of a circle with the radius "+radius+" is: "+area);


//        System.out.println("Enter a radius: ");
//        if (input){
//
//        }
//
//        double radius= input.nextDouble();
//        while (radius<0){
//            System.out.println("Please input a positive number");
//            System.out.println("Enter a radius: ");
//            radius= input.nextDouble();
//        }
//


    }
}
