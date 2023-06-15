package day16_forLoopNestedLoop;

import java.util.Scanner;

public class calculateSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")){

            System.out.println("Enter the side of the square:");
            double squareSide = input.nextDouble();
            if(squareSide == 0 || squareSide < 0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }

            double area = squareSide * squareSide;
            double perimeter = (squareSide * squareSide * squareSide *squareSide);

            System.out.println("Area of square = " + area + "\n perimeter of square = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            answer = input.next().toLowerCase();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.out.println("invalid answer! please try again");
                answer = input.next().toLowerCase();
            }
            if(answer.equalsIgnoreCase("no")){

                System.out.println("Thank you for using Cydeo Square Calculator APP");

            }
        }
        input.close();




    }
}
/*
 Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2.  perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */
