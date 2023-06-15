package day16_forLoopNestedLoop;

import day07_ifStatement.grade;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String amswer = "yes";

        while (amswer.equalsIgnoreCase("yes")){


            System.out.println( "Enter your score");
            int score = input.nextInt();

            if(score < 0 || score > 100){
                System.out.println( "Invalid Entry");
                System.exit(0);
            }
            String grade = (score >= 90 && score <= 100)? "A" :(score >= 80 && score <= 89)? "B" :(score >= 70 && score <= 79)? "C" :(score >= 60 && score <= 69)? "D" : "F";
            System.out.println(grade);

            System.out.println("would you like to continue?");
            amswer = input.next();

            if (!(amswer.equalsIgnoreCase("yes") || amswer.equalsIgnoreCase("no"))){
                System.out.println("Invalid Entry");
                System.exit(0);
            }

            if(amswer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
            }


        }
        input.close();


    }
}
/*
 Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */