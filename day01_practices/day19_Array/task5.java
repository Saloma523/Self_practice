package day19_Array;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};




        for (int i = num.length-1;i>= 0; i--) {

            int[] num2 = new int[] {num[i]};



            System.out.println(Arrays.toString(num2));

        }


    }
}
/*
 Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */