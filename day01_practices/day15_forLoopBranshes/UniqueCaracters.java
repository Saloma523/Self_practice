package day15_forLoopBranshes;

public class UniqueCaracters {
    public static void main(String[] args) {
        String str = "aabccchdddu";
        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    count++;
                }


            }
            if(count == 1){
                result+= ch ;
            }

        }
        System.out.println(result);

    }
}
/*
Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */
