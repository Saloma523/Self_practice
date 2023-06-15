package day19_Array;

public class classmates2 {
    public static void main(String[] args) {

        String [] classmates  = {"salma ", " ahmed ","israa "};
        String reverse = "";
        for (int i = 0; i < classmates.length; i++) {
            String each = classmates[i];

            for (int j = each.length()-1; j >=0 ; j--) {

                reverse+= each.charAt(j);


            }


        }
        System.out.println(reverse);


    }

}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */
