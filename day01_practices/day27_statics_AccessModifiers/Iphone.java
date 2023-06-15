package day27_statics_AccessModifiers;

public class Iphone {

    public static String brand;
    public String model,  size, color;
    public double price;
    public static String OS;
    public static boolean  isSmartPhone;
    public static String madeIn, designedIn;

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "ios";
        isSmartPhone = true;
        madeIn = "china";
        designedIn = "USA";
    }

    public void  printOperatingSystem(){
        System.out.println("OS is: " + OS);
    }

    public void call(long phoneNumber){
        System.out.println("");
    }


}
/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
