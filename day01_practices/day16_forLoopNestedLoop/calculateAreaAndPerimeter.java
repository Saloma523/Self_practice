package day16_forLoopNestedLoop;

import java.util.Scanner;

public class calculateAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";
        while (answer.equalsIgnoreCase("yes")){


            System.out.println("Enter the radius of the circle");
            double radius = input.nextDouble();

            if (radius == 0 || radius < 0) {
                System.out.println("Invalid entry for the radius of the circle");
                System.exit(0);
            }
            Double diameter = radius * 2;
            double area = 3.14 * (radius * radius);
            double perimeter = 3.14 * diameter;
            System.out.println("Diameter = " + diameter + "\n area = " + area + "\n perimeter = " + perimeter);

            System.out.println("wpold you like to calculate another circle?/yes/no");
            answer = input.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("invalid entry! try again");
                answer = input.next();
            }
            if(answer.equalsIgnoreCase("no")){
                System.out.println( "Thank you for using Cydeo Circle Calculator APP");
            }


        }
        input.close();






        }



    }





/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */
