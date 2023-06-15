package day07_ifStatement;

public class cappuccionBuyer {
    public static void main(String[] args) {
        String size = "venti";
        String size1 = " tall";
        String size2 = "grande";
        String size3 = "venti";
        if(size == size1 || size == size2 || size == size3){
            if(size == size1){
                System.out.println("Price is $3.69\n90 calories");
            }else if(size == size2){
                System.out.println("Price is $3.99\n120 calories");
            }else{
                System.out.println("Price is $4.29\n150 calories");
            }

        }else{
            System.out.println("invalid size");
        }
    }
    /*
    1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

     */

}
