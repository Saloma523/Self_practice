package day09_ScannerIntro;

import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate");
        double hourlyR = input.nextDouble();

        System.out.println("Enter how many hours you worked");
        int hoursW = input.nextInt();

        System.out.println("Enter state tax");
        int statX = input.nextInt();

        System.out.println("Enter your federal tax");
        int federalX = input.nextInt();

        double salary = hourlyR * hoursW * 52;
        double totalX = salary * statX * federalX;
        double netIncome = salary - totalX;




        input.close();





        }
    }

/*
Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
