package day23_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class multiplyEachAdd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (Integer each : list) {
            if(each % 2 != 0){
                each *= 2;
            }
            System.out.println(each);

        }


    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

 */
