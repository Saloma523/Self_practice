package day11_stringMethods;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);

        String word = input.next();
        boolean r = word.startsWith("x");

        if(r){
            System.out.println( word.replace('x', 'a'));
        }



        input.close();

    }
}
/*
 Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

 */
