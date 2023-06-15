package day14_returnMethodsOverload_Loop;

public class factorialNumber {
    public static void main(String[] args) {

        factorialNum(5,5);
    }

    public static void factorialNum(int num, int limit){

        for (int i = 1; i <= limit ; i++) {
            int factorial  = limit * num;

        }
    }
}
/*
 Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
