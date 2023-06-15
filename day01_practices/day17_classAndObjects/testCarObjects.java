package day17_classAndObjects;

public class testCarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.seInfo(2011,"tayota", 2015,"black",15000);

        System.out.println(car1);
        car1.start();
    }
}
