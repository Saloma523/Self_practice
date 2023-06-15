package day22_ArrayList;

import utilites.ArrayUtilities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class combine2Arrays {
    public static void main(String[] args) {

       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};
        //list ==> {"A", "B", "C", "D", "E", "F", "G"}
        String[] arr3 = ArrayUtilities.merge(arr1,arr2);



        System.out.println(Arrays.toString(arr3));

    }
}
