package day20_day20_ArrayMethodsAndForEachLoop;

public class countEvenAndOdd {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
         int evenCount = 0;
        int oddCount = 0;

        for (int each : numbers) {

            if(each % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }


        }
        System.out.println(evenCount + " even numbers " + oddCount + " odd numbers");
    }
}
/*1.  Write a program that can count the even and odd number from an array of integers

        Note: MUST use for each loop*/

