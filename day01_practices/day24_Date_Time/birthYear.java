package day24_Date_Time;

import java.time.LocalDate;

public class birthYear {
    public static void main(String[] args) {


    }

    public static boolean leapYear(int birthYear, int month, int day){



        if (LocalDate.of(birthYear,month,day).isLeapYear()){
            return true;

        }

        return false;
    }
}
/*
Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false

 */
