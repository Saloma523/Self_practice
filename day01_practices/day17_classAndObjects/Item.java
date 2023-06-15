package day17_classAndObjects;

public class Item {

    public String name;
    public double price;
    public int quantity;

    public void setInfo(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void CalcCost(){

        double cost = price * quantity;
        System.out.println(cost);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
/*
Create a class called Item
    Attributes:
        name, unitPrice, quantity

    Actions:
    	setInfo(): sets all the fields of Item object
        calcCost(): returns the total price of the Item
        toString(): when a SalaryCalculator object is passed in print statement, it should display the full information of the item object


 */
