package day07_ifStatement;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 15;
        String result = "";
        if(age >= 1 && age <= 150){
            if(age < 21){
                result = "Teenager";
            }else if(age >= 21){
                result = "Adult";
            }else
                result = "senior";

        }else{
            result = "invalid";
        }
        System.out.println(result);
    }
    /*
     Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

     */
}
