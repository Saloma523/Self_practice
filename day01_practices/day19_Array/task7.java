package day19_Array;

import utilites.ArrayUtilities;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
       int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);

        System.out.println(Arrays.toString(ArrayUtilities.reverse(array)));
    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
