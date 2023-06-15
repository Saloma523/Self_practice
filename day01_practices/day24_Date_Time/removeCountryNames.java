package day24_Date_Time;

import java.util.ArrayList;
import java.util.Arrays;

public class removeCountryNames {
    public static void main(String[] args) {

        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.addAll(Arrays.asList("United states", "germany", "sudan", "qatar", "dubai"));

        countryNames.removeIf(p-> p.length() >= 10);
        System.out.println(countryNames);
    }
}
/*

6. Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */
