package day11_stringMethods;

import java.util.Scanner;

public class CombindWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = input.next();
        System.out.println("Enter the second word");
        String word2 = input.next();

        int lastIndexNum = word1.length()-1;
        char end = word1.charAt(lastIndexNum);
        char start = word2.charAt(0);

        if(end == start){
            System.out.println(word1 + "\n" + word2);
        }else{
            System.out.println(word1 + word2);
            input.close();
        }
    }
}
/*
 Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */
