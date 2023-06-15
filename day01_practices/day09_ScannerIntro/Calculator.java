package day09_ScannerIntro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter a math operator");
        String mathO = input.next();

        System.out.println("Enter the second number");
        int num2 = input.nextInt();


       if(mathO == " + "|| mathO == " - "|| mathO == "*" || mathO == "/") {

           switch (mathO) {
               case "+":
                   System.out.println(num1 + num2);
                   break;
               case "-":
                   System.out.println(num1 - num2);
                   break;
               case "*":
                   System.out.println(num1 * num2);
                   break;
               case "/":
                   System.out.println(num1 / num2);

           }


       }else{
           System.out.println("invalid entry");
       }
       input.close();
    }

}
/*
 Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */
