package day15_forLoopBranshes;

import java.util.Scanner;

public class cydeoCredentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();
        System.out.println("Enter your password");
        String password = input.next();

        if(username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");
        }else{
            for (int i = 1; i <= 3; i++) {
                if(i != 3) {
                    System.out.println("incorrect password or username! please try again");
                }else{
                    System.out.println("this is your last attempt! please enter your username and password");
                }
                System.out.println("enter your username");
                username = input.next();
                System.out.println("enter your password");
                password = input.next();

                if((username.equals("Cydeo") && password.equals("Cydeo123"))){
                    System.out.println("Your logged in");
                    break;
                }
                if(!(username.equals("Cydeo") && password.equals("Cydeo123"))){
                    System.out.println("your account is lucked");
                }


            }
            input.close();
        }




    }

    public static void login(String username, String password){

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
