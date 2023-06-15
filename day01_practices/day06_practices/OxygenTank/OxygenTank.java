package day06_practices.OxygenTank;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygen = 50;

        String result = "";
        if(oxygen >= 90){
            result = "Your tank is full";
        }
        if(oxygen < 90 && oxygen >=80){
            result = "Still okay";
        }
        if(oxygen < 80 && oxygen >= 70){
            result = "Dont go too far";
        }
        if(oxygen <70 && oxygen >=60 ){
            result = "Start to hed back";
        }
        if(oxygen < 60 && oxygen >= 50){
            result = "Be careful now you at 50%";

        }
        System.out.println(result);

    }
    /*
    8. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

     */
}
