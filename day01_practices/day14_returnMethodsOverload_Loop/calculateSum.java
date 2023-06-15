package day14_returnMethodsOverload_Loop;

public class calculateSum {
    public static void main(String[] args) {
        calculateSum(5,5);

    }

    public static void calculateSum(int num, int limit){
        String sum = "";
        for (int i = 1; i <= limit ; i++) {
            System.out.println( num + " + " +  i + " = " + (num + i));

        }


    }

}
/*
 write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */