package day15_forLoopBranshes;

import java.util.Scanner;

public class marriageProposal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("will you marry me?");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.out.println("invalid answer! please try again");
            answer = input.next();
            input.close();
        }

        if(answer.equals("yes")){
            System.out.println("congrats");
        }else{
            System.out.println("Goodbye");
        }

    }
}
/*
  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no


2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
