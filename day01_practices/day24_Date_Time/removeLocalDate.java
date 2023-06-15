package day24_Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class removeLocalDate {
    public static void main(String[] args) {
        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.of(2022,4,3), LocalDate.of(2012,10,1),LocalDate.of(2014,6,2),LocalDate.of(2023,4,3)));

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/y");

        dates.removeIf(p-> !p.equals(LocalDate.of(2016,8,15).format(df)));

        System.out.println(dates);


    }
}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */
