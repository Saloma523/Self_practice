package day12_customMethods;

public class day {
    public static void main(String[] args) {

        nameOfTheDay(1);

    }
    public static void nameOfTheDay(int number){

        String result = (number == 1)? "Monday" :(number == 2)? "Tuesday" :(number == 3)? "Wednesday" :(number == 4)? "Thursday" :(number == 5)? "Friday" :(number == 6)? "Saturday" :(number == 7)? "Sunday" : "Invalid number";
        System.out.println(result);


    }
    /*
     Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
     */
}
