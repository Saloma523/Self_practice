package day11_stringMethods;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String x = input.next();
        boolean hasX = x.contains("x");
        if(hasX){
            System.out.println(x.toLowerCase().replace('x', 'a'));

        }
        input.close();

    }
}
/*
 Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */