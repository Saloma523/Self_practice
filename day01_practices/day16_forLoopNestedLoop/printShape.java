package day16_forLoopNestedLoop;

public class printShape {
    public static void main(String[] args) {
        String result = "";

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 1; j++) {
                char c = '*';
                result+= ""+c++;


            }
            System.out.println( result + " ");

        }

    }
}
/*
 Use a nested loop to print the following shape

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */
