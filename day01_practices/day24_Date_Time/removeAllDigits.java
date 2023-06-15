package day24_Date_Time;

import utilites.ArrayUtilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeAllDigits {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p-> p >= 48 && p <= 57);

        System.out.println(list);













    }
}
/*
 Write a program that can remove all the digits from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

	Note: DO NOT use any loops
 */
