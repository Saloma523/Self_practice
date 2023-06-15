package day13_returnMethods;

public class maxAndMinimum {
    public static void main(String[] args) {

        System.out.println(max(5,6));
        System.out.println(minimum(8,4));

    }

    public static String max(int num1, int num2){
        return (num1 > num2)? num1 + " is the maximum number" : num2 + " is the maximum number";
    }

    public static String minimum(int num1, int num2){
        return (num1 < num1)? num1 + " is the minimum number" : num2 + " is the minimum number";
    }
}
/*
Create a method named max, that can return the maximum number between two numbers
Create a method named min, that can return the minimum number between two numbers
 */
