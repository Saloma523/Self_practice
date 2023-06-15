package day07_ifStatement;

public class gradeLevel {
    public static void main(String[] args) {
        int gradeLevel = 3;
        String result = "";

        if(gradeLevel >= 1 && gradeLevel <= 18){
            if(gradeLevel <= 5){
                result = "Elementary school";
            }else if(gradeLevel<= 8){
                result = "Middle school";
            }else if(gradeLevel <= 12){
                result ="High school";
            }else if(gradeLevel <=16){
                result = "College";
            }else{
                result = "Grad school";
            }

        }else{
            result = " not valid grade level";
        }
        System.out.println(result);


    }

}
