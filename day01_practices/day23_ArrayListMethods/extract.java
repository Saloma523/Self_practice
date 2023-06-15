package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class extract {
    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";
       String digits = "";
       String letters = "";
       String specialChar = "";

       char[] str1 = str.toCharArray();
        for (char each : str1) {
            if(Character.isDigit(each)){
                digits+=  each;
            }else if(Character.isLetter(each)){
                letters+= each + ", ";
            }else if(!Character.isLetterOrDigit(each)){
                specialChar += each + ", ";
            }

        }
       Integer digits2 =  Integer.parseInt(digits);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(digits2));
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(letters));
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList(specialChar));
        System.out.println(list3);
    }
}
/*
 Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}

 */
