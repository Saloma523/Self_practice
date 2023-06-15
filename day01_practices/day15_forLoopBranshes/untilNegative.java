package day15_forLoopBranshes;

import java.util.Scanner;

public class untilNegative {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0;  ; ) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number");
            int num = input.nextInt();
            sum += num +i;
            System.out.print(sum);

            if(num < 0){
                break;

            }



        }



    }

}
/*
Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

 */
