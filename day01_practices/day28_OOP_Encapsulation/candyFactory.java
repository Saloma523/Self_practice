package day28_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class candyFactory {
    public static void main(String[] args) {

        Candy candy1 = new Candy("skitiles",1,4.99,false);
       Candy candy2 = new Candy("racase",4,10.23,true);
       Candy candy3 =new Candy("hershies",2,3.99,false);
       Candy candy4 = new Candy("airhead",3,5.99,false);
       Candy candy5 = new Candy("mm", 1,4.99,true);

        ArrayList<Candy> list = new ArrayList<>();
        list.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        System.out.println(list);

        for(Candy each: list){

            System.out.println(each.getBrand() + " : " + each.getPrice());
        }
    }
}
 /* 5.1 Create a class named CandyFactory
        Create an ArrayList of candies
        Add five objects of candies
        use for each loop to print the brand and price of each candy

  */
