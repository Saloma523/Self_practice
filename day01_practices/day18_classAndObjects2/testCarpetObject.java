package day18_classAndObjects2;

public class testCarpetObject {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();

        carpet1.setInfo(15,8,80,true);

        System.out.println(carpet1);

        carpet1.calcCost();
    }
}
