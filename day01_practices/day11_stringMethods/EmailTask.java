package day11_stringMethods;

public class EmailTask {
    public static void main(String[] args) {
        String email = "Salma_Ahmed@yahoo.com";
        String email2 = email.replace("Salma_", "");

        System.out.println(email2 );
    }
}
/*
 Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */
