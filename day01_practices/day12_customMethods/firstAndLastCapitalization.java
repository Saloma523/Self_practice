package day12_customMethods;

public class firstAndLastCapitalization {
    public static void main(String[] args) {

        capitalization("sAlma","aHMED");
    }

    public static void capitalization(String fistName, String lastName){


       String f = fistName.substring(0,1).toUpperCase() + fistName.substring(1).toLowerCase();
       String l = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(f + " " + l);
    }

}
/*
Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

 */
