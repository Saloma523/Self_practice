package day12_customMethods;

public class emailDomain {
    public static void main(String[] args) {

     Domain("salma@yahoo.com");


    }


    public static void Domain(String email){

       int i1 = email.indexOf("@");
       int i2 = email.indexOf(".");
        System.out.println(email.substring(i1 + 1,i2));
    }
}
/*
. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */
