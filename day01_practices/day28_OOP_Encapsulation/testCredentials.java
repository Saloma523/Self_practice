package day28_OOP_Encapsulation;

public class testCredentials {
    public static void main(String[] args) {

        Credentials c1 = new Credentials("saloma523", "Omnia810");

        System.out.println(c1);

        c1.isStrongPassWord("Omnia810");


    }
}
