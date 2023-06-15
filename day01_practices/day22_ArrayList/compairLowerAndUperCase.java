package day22_ArrayList;

public class compairLowerAndUperCase {
    public static void main(String[] args) {


       String  str = "JAVA Java";
       char [] str1 = str.toCharArray();

       String upperCaseCount = "";
       String lowerCseCount = "";

       for(char each: str1){
           if(Character.isUpperCase(each) == true){
               upperCaseCount+= each;
           }else if(Character.isLowerCase(each)== true){
               lowerCseCount+= each;
           }
       }
       if(upperCaseCount.length() == lowerCseCount.length()){
           System.out.println(true);
       }else{
           System.out.println(false);
       }




    }
}
