package day19_Array;

public class task3 {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int index = items[2].indexOf('G');




        for (int i = 0; i < items.length; i++) {
            String each = items[i];
            String result = "";
            String R = "";

            if(each == "ipad"){
                System.out.println(true);
            }
            for (int i1 = 0; i1 < prices.length; i1++) {
                double p = prices[i1];


                for (int i2 = 0; i2 < itemIDs.length; i2++) {

                    int id =itemIDs[i2];

                     R =  each + " " + p + " " + id;
                }
            }
            if(!result.contains(R)){
                result+= R;
            }
            System.out.println(result);


        }


    }
}
/*
Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */
