package day11_stringMethods;

public class EmailTask2 {
    public static void main(String[] args) {
        String email = "Salma_Ahmed@yahoo.com";
        String w1 = email.substring(0,4+1);
        String w2 = email.substring(6,10+1);

        int beginingIndex = email.indexOf('@')+1;
        int endingIndex = email.lastIndexOf('.');
        String domain = email.substring(beginingIndex,endingIndex);

        System.out.println("first name:" + w1);
        System.out.println("Last name:" +w2);
        System.out.println("domain:" + domain);



    }
}
/*
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */
