package day09_ScannerIntro;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
        double diameter = radius * 2;
        double area = 3.14 * (radius * radius);

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("are = " + area);
        input.close();

    }
}
/*
   Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */
