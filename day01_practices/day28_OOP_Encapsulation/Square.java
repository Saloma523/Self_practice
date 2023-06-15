package day28_OOP_Encapsulation;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0){
            System.err.println("side can not be negative");
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double calcArea(){
        return side * side;
    }

    public double calcPerimeter(){
        return side * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side + ", Area:" + calcArea() + ", perimeter:" + calcPerimeter() +
                '}';
    }
}
/*
. Create a class named Square:
        Private variables:
            side

        Encapsulate all the fields

            Condition:
                side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.


        Methods:
            calcArea(): returns the area of square
            calcPerimeter(): returns the perimeter of square
            toString(): can display the side, area, perimeter of square when object is passed in print statement
 */
