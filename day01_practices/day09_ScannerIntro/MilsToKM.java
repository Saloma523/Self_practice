package day09_ScannerIntro;

import java.util.Scanner;

public class MilsToKM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles = input.nextDouble();

        double KM = miles * 1.61;
        System.out.println(miles + " miles equal to " + KM + " kilometers");

        input.close();
    }
}
/*
 Create a class named MilesToKM, write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */
