package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class moveToLastIndex {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        Collections.sort(list);
        Collections.reverse(list);


        System.out.println(list);




    }
}
/*
 Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */
