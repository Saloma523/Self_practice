package day07_ifStatement;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 20;
        String result = "";

        if(number > 0){
            result = "positive";
        }else if(number < 0){
            result = "Negative";
        }else{
            result = "zero";
        }
        System.out.println(result);

    }
}
/*
1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
 */
