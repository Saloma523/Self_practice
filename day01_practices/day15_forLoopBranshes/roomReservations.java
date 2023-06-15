package day15_forLoopBranshes;

import java.util.Scanner;

public class roomReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";

        while((answer.equalsIgnoreCase("yes"))){
            System.out.println("Do you want to reserve a room?");
            String reserve = input.next();
            System.out.println("What type of room?");
            input.nextInt();
            String roomType = input.nextLine();
            input.close();
            double price = 0;
            switch (roomType){
                case "King Bed":
                    price+= 120;
                    break;
                case " Queen Bed":
                    price+= 100;
                    break;
                case "Queen Bed ":
                    price+= 80;
                    break;
                default:
                    System.out.println("invalid room entry");
            }
            System.out.println("Your reserved a " + roomType + " the price is: " + price + "$");

            while (!(reserve.equalsIgnoreCase("yes") || reserve.equalsIgnoreCase("no"))){
                System.out.println("invalid entry! please try again");
                reserve = input.next();

            }

        }







    }
}
/*
 Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	             Queen Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */
