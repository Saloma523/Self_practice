package day20_day20_ArrayMethodsAndForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,4,5,6,1};




        for (int elements : arr) {
            int count = 0;
            for(int each: arr){
                if(each == elements){
                    count++;
                }
            }
            if(count == 1){

                System.out.println(elements);
            }





        }

    }
}
/*
  4. Write a program that can display the unique elements of an array

            MUST use for each loops*/


