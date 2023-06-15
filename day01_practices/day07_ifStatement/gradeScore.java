package day07_ifStatement;

public class gradeScore {
    public static void main(String[] args) {
        int score = 95;
        String result = "";
        if(score >= 0 && score <= 100){

            if(score >=90){
                result = "your grade is: A";
            }else if(score >=80 ){
                result = "your grade is: B";
            }else if(score >=70 ){
                result = "your grade is: C";
            }else if(score >=60 ){
                result = "your grade is: D";
            }else{
                result = " your grade is: F";
            }



        }else{
            result = "invalid score";
        }
        System.out.println(result);



    }
    /*
    1. Create a class named GradeReport.java
2. An integer variable named score is declared and given, Write a
program that can print the grade of the student.
(only if the given score is a valid score, then print the name of the
month. Otherwise, print Invalid)
Ex:
score = 95
output:
Your grade is A
     */
}
