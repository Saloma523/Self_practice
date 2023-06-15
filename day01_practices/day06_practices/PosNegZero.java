package day06_practices;

public class PosNegZero {
    /*
    1. Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
     */

    public static void main(String[] args) {

        int number = 20;
        boolean isPositive = number >= 1;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        if(isPositive){
            System.out.println("Positive");
        }
        if(isNegative){
            System.out.println("Negative");
        }
        if(isZero){
            System.out.println("Zero");
        }
    }
}
