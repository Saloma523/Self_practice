package day17_classAndObjects;

public class testRectangleObjects {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.setInfo(4,6);

        rectangle1.calculateArea();

        rectangle1.calculatePerimeter();


        System.out.println(rectangle1);
    }
}
