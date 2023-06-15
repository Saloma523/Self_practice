package day17_classAndObjects;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        double area = length * width;
        System.out.println(area + " is the area");
    }


    public void calculatePerimeter(){
        double perimeter = length + length + width + width;
        System.out.println(perimeter + " is the perimeter");
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
/*
 create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object

 */
