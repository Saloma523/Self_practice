package day12_customMethods;

public class daysInMonth {
    public static void main(String[] args) {
        daysMonthHave("July");
    }

    public static void daysMonthHave(String month){

        boolean has28Days = month == "February";// if the month number is 2 ( feb) then it has 28 days
        boolean has30Days = month == "April" || month == "June" || month == "September" || month == "October";
        boolean has31Days = !has28Days && !has30Days;

        String result = "";

        if(has28Days){

            result =" 28 days";
        }
        if(has30Days){

            result = " 30 days";
        }
        if(has31Days){

            result = " 31 days";
        }
        System.out.println(result);
    }
}
/*
 Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
 */
