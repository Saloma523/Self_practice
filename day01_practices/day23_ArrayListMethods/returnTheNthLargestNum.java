package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class returnTheNthLargestNum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println(list);

        list.removeAll( Arrays.asList(Collections.max(list)));
        System.out.println(list);
        list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println(list);
       list.removeAll(Arrays.asList(Collections.max(list)));
        System.out.println(list);
        int max5 = Collections.max(list);
        System.out.println(max5);
    }
}
  /*  write a program that can return the nth largest number from an arraylist
        ex:
        arraylist = {1,2,3,4,5,6,7,7,8,8}
        n = 5

        output:
        4
        */
