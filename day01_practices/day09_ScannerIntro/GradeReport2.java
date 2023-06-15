package day09_ScannerIntro;

import java.util.Scanner;

public class GradeReport2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
     ;

         String grade = (score >= 0 && score <= 100)? (score >= 90)? "your grade is: A" :(score >= 80)? "your grade is: B" :(score >= 70)? "your score is: C" :(score >= 60)? "your grade is: D" : "your score is: F" : "invalid score";

        System.out.println(grade);

        input.close();



    }
}
/*
Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

 */
