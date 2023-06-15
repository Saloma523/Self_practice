package day06_practices;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;
        boolean aIsMedian = a > b && a < c;
        boolean bIsMedian = b > a && b < c;
        boolean cIsMedian = !aIsMedian && !bIsMedian;



        if(aIsMedian ){

            System.out.println(a + " is the median number");

        }
        if(bIsMedian){
            System.out.println(b + " is the median");
        }
        if(cIsMedian){
            System.out.println(c + " is the median");
        }


    }
    /*
    1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

     */
}
