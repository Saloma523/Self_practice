package day15_forLoopBranshes;

import java.util.Scanner;

public class frequencyOfChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine().toLowerCase();
        System.out.println("Enter a char");
        char ch = input.next().charAt(0);
        input.close();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){/*if the character of the string equal to the given character it gives the number of times its appeared*/
                count++;
            }

        }
        System.out.println(count);







    }
}
/*
 Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
