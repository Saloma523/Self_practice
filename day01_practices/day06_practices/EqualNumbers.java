package day06_practices;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 5;
        int n3 = 5;

        String result = "";
        if(n1 == n2 && n2 == n3){
            result = "\"all equal\"";
        }
        if(n1 == n2){
            result = "\"n1&n2 are equal";
        }
        if(n2 == n3){
            result = "\"n2&n3 are equal\"";
        }
        if(n3 == n1){
            result = "\"n3&n1 are equal";
        }
        if(n1 != n2 && n2 != n3){
            result = "\"none of them are equal\"";
        }
        System.out.println(result);
    }
    /*
    7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are equal ==>print "n3&n1 are equal"
				if none of them are equal ==> none of them are equal


     */
}
