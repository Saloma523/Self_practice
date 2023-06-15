package day13_returnMethods;

public class combine {
    public static void main(String[] args) {
        System.out.println(combine("salma", "mohamed"));
    }

    public static String combine(String word1, String word2) {

        if(word1.endsWith( "" + word2.charAt(0))){
            return word1 + word2.substring(1);
        }else{
           return  word1 + word2;
        }


    }
}
       /* char w1 =  word1.charAt(word1.length()-1);
       char w2 = word2.charAt(0);

        return (w1 == w2)? "" + w1 : word1 + word2;*/




/*

5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */
