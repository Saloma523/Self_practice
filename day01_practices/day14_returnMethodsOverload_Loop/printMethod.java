package day14_returnMethodsOverload_Loop;

public class printMethod {

    public static void main(String[] args) {
        System.out.println(printFINRA()); ;
    }
    public static String printFINRA(){

       String result = "";
        for(int i = 1; i <= 100; i++) {

            if (i == (5 * 3)) {
              result =  "FINRA";
            } else if (i == (1 * 3)) {
               result = "FIN";
            } else if (i == (5 * 1)) {
               result =  "RA";
            }

        }
        return result;

    }


}
/*
 Write a method which prints out the numbers from 1 to 100 but for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
 */
