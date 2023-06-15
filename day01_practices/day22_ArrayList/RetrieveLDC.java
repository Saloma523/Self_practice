package day22_ArrayList;

public class RetrieveLDC {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        char[] str1 = str.toCharArray();
        String letter = "";
        String Digit = "";
        String specialChars = "";
        for(char each: str1){
            if(Character.isDigit(each) == true){
                Digit += each;
            }else if(Character.isLetter(each) == true){
                letter += each;
            }else if(!Character.isLetterOrDigit(each) == true){
                specialChars += each;
            }

        }
        System.out.println(letter);
        System.out.println(Digit);
        System.out.println(specialChars);
    }
}
