package day11_stringMethods;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("is bill split?");
        String answer = input.next();

        System.out.println("Enter the number of people");
        int numOfPeople = input.nextInt();

        System.out.println("Enter the check amount");
        double check = input.nextDouble();

        input.nextLine();

        System.out.println("Enter service quality");
        String service = input.nextLine();

        double tipPrscent = 0;


        if(service.equals("poor")){
           tipPrscent = .05;
        }else if(service.equals("fair")){
            tipPrscent = .10;
        }else if(service.equals("good")){
            tipPrscent = .15;
        }else if(service.equals("Great")){
            tipPrscent = .20;
        }else if(service.equals("Excellent")){
            tipPrscent = .25;
        }


        double totalTip =  check * tipPrscent;
        double totalPay = check +totalTip;
        double totalPerPerson = totalPay/numOfPeople;
        double tipPerPerson = totalTip/numOfPeople;


        System.out.println("Number of people entered: " + numOfPeople + "\nTotal to pay: " + totalPay + "\nTotal tip: " + totalTip + "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson);

    }
}
/*

8. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */
