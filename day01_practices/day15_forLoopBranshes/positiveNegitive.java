package day15_forLoopBranshes;

import java.util.Scanner;

public class positiveNegitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String resultPositive = "";

        for(int i = 0; i < 5 ; i++){
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number < 0){
                continue;
            }
            resultPositive = resultPositive + i;

        }
        System.out.println(resultPositive.length() + " positive " +  (5-resultPositive.length()) + " negative");
        input.close();

    }
}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
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
