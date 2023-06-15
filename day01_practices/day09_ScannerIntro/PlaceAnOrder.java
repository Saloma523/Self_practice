package day09_ScannerIntro;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name");
        String pName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        System.out.println("Enter your first name");
        String fName = input.next();

        System.out.println(fName + ", your order for " + quantity + " " + pName + " has been placed. Your total is " + price);
        input.close();
    }
}
/*
Create a class named PlaceAnOrder:
                Ask User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
