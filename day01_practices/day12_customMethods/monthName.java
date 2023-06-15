package day12_customMethods;

public class monthName {
    public static void main(String[] args) {

        monthName(5);

    }

    public static void monthName(int number){

        String result =(number == 1)? "January" :(number == 2)? "February" :(number == 3)? "March" :(number ==4)? "April" :(number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "August" :(number == 9)? "September" :(number == 10)? "October" :(number == 11)? "November" :(number == 12)? "December" : "Invalid number";
        System.out.println(result);
    }
}
/*
 Create a method named monthName that can display the name of the month based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
