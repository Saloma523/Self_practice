package day04_Concatenation;

public class CarInfo {
    /*
    1. Create a class named CarInfo.java
2. Declare the following variables:
1. year
2. make
3. model
4. miles
5. color
6. Price
3. Use concatenation to print the full info of the car in the
following format:
Year Make Model, Miles, Color, Price.
Ex:
Car information is :
2018 Toyota Camry, 50000 miles, Red, $19000
     */
    public static void main(String[] args) {

        String year = "2018";
        String make = "Toyota";
        String model = "camry";
        String mile = "50000 miles";
        String color = "Red";
        String price = "19000";

        System.out.println("Car information is :" + "\n" + year + " " + make + " " + model + ", " + mile + ", " + color + ", " + "$" + price);

    }
}
