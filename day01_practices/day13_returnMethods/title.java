package day13_returnMethods;

public class title {
    public static void main(String[] args) {

        System.out.println(title("sALMA"));

    }

    public static String title(String word){
       return word.substring(word.charAt(0)).toUpperCase() + word.substring(word.charAt(1)).toLowerCase();

    }
}
/*
 Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java


 */
