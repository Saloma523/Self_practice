package day24_Date_Time;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLetters {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

       list.removeIf(p-> p >= 65 && p <= 90 );

        System.out.println(list);

       /* for (Character each : list) {
            if(Character.isDigit(each) == true){
                list.remove(each);
            }
        }
        System.out.println(list);

        */

    }
}
/*
Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']

 */
