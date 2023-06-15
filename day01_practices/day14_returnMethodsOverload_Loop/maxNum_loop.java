package day14_returnMethodsOverload_Loop;

import java.util.Scanner;

public class maxNum_loop {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int max = -2147483648; // we use the smallest number possible for int type so all other numbers can be bigger. It is a better default than 0. We will talk about this idea more later

            for(int i = 0; i < 5; i++){
                System.out.println("Please enter number " + i);
                int num = input.nextInt();

                if(num > max){
                    max = num;
                }
            }

            input.close();
            System.out.println("Biggest number entered was " + max);




        }








}

  /*  public static void main(String[] args) {


        int size;
        Scanner scan = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter an array size.");
        size = scan.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter each integer in the array and press Enter after each one.");

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        scan.close();

        for (int j = 0; j < size; j++) {

            if (numbers[j] < smallest) {
                smallest = numbers[j];
            } if (numbers[j] > largest) {
                largest = numbers[j];
            }
        }

        System.out.println("Smallest Number is " + smallest);
        System.out.println("largest = " + largest);*/











