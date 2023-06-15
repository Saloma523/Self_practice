package day18_classAndObjects2;

public class testContantObject {
    public static void main(String[] args) {
        Contact contact1 = new Contact();

        contact1.setInfo("salma",57127733, "saloma523@yahoo.com");

        System.out.println(contact1);

        contact1.call();
        

        contact1.sendEmail();
        contact1.sendMessage();
    }


}
