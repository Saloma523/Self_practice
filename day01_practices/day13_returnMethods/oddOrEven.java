package day13_returnMethods;

public class oddOrEven {
    public static void main(String[] args) {
        String d =oddOrEven(5);
        System.out.println(d);

       boolean n1 = isOdd(4);
       boolean n2 = isEven(4);




    }
    public static String oddOrEven(int num){
       return (num % 2 == 0)? num + "is even" : num + "is odd";
    }
    public static boolean isOdd(int num){
        return (num % 2 != 0)? true : false;
    }

    public static boolean isEven(int num){
        return (num % 2 == 0)? true : false;
    }



}
/*
 Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false

 */
