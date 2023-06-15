package day17_classAndObjects;

public class testItem {

    public static void main(String[] args) {

        Item item1 = new Item();

        item1.setInfo("candy",4,4);

        System.out.println(item1);

        item1.CalcCost();
    }

}
