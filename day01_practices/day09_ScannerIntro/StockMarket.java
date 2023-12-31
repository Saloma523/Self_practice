package day09_ScannerIntro;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your total shares");
        int shares = input.nextInt();

        System.out.println("Enter your total value in stock market");
        double totalV = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your company name with the most shares");
        String companyN = input.nextLine();

        System.out.println("Your total stock market holding is $" + totalV + " which is made up of  " + shares + ". " + companyN + " is your company holdings");

        input.close();
    }
}
/*
Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */