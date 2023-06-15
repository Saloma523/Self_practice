package day06_practices;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch= '1';
        boolean digit = ch >='0' && ch <='9';
        boolean isLetter = ch >= 'A' && ch <='Z' || ch >='a' && ch >= 'z';
        boolean isSpecialCh = !digit && !isLetter;
        String result = "";
        if(digit){
            result = "digit";
        }
        if(isLetter){
            result = "special character";
        }
        if(isLetter){
            result = "is letter";
        }

    }
    /*
    5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table


     */
}
