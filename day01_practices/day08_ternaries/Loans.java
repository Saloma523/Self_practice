package day08_ternaries;

public class Loans {
    public static void main(String[] args) {
        int salary = 100_000;
        int credit = 500;
        String result = (salary >=60000 && credit >= 650)? "Loam Approved" : "Loan Denied";
        System.out.println(result);
    }
    /*
    2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.


     */
}
