package day12_customMethods;

public class voting {
    public static void main(String[] args) {

        eligibleToVote(18,true);

    }

    public static void eligibleToVote(int age, boolean isAmerican){

       boolean a =  isAmerican == true;
       if(a && age >= 18){
           System.out.println("You are eligible to vote");
       }else{
           System.out.println("You are not eligible to vote");
       }
    }
}
/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote


 */
