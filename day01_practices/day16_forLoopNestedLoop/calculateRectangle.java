package day16_forLoopNestedLoop;

import java.util.Scanner;

public class calculateRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")){


            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();

            if(length == 0 || length < 0){
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();

            if(width == 0 || width < 0){
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double area = 0;
            double Perimeter = 0;

            System.out.println("Would you like to calculate another Rectangle?");
            answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("invalid entry! please try again");
                answer = input.next();
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            }



        }
        input.close();


    }
}
/*
 Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */
