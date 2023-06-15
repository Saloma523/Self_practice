package day24_Date_Time;

import java.util.ArrayList;
import java.util.Arrays;

public class removeSpecialChar {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p-> p >= 30 && p <= 47);
        list.removeIf(p-> p >= 58 && p <= 64);

        System.out.println(list);
    }

}
/*
Write a program that can remove all the special characters from an arraylist of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			[A', 'B', '1', '2', 'C', 'D', '3', '4']

	Note: DO NOT use any loops
 */
