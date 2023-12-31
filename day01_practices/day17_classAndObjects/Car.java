package day17_classAndObjects;

public class Car {

    public int make;
    public String model;
    public int year;
    public String color;
    public double price;

    public void seInfo(int make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make=" + make +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(model + "star");
    }
}
/*
 Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */
