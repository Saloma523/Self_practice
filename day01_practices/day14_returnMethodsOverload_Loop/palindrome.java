package day14_returnMethodsOverload_Loop;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("level"));
    }

    public static boolean palindrome(String str){
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);


        }
        if(str.equalsIgnoreCase(reverse)){
            return true;

        }else{
            return false;
        }
    }
}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */
