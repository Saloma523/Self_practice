package day24_Date_Time;

import java.util.ArrayList;
import java.util.Arrays;

public class removeStringElements {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p-> p.charAt(0) == p.charAt(p.length()-1));

        System.out.println(list);

    }
}
/*
Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]

 */
