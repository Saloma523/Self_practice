package day26_constructors_statics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class localRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Salma","12581 Plymouth court",4);

        Server server1 = new Server("mohamed",3, 30,true, LocalDate.of(2023,4,2));
        Server server2 = new Server("somis",4,15, false,LocalDate.of(2022,3,6));
        Server server3 = new Server("Hamid",2,30,true,LocalDate.of(2021,6,7));
        Server server4 = new Server("Ali",6,15,false,LocalDate.of(2021,8,2));

        Server[] server = {server1,server2,server3,server4};

        restaurant1.servers.addAll(Arrays.asList(server));

        System.out.println(Arrays.toString(server));


        Chef chef1 = new Chef("Amns",3,50,true );
        Chef chef2 = new Chef("Islam",7,25,false );
        Chef chef3 = new Chef("osman",1,50,true );
        Chef chef4 = new Chef("omer",5,25,false);


        Chef[] chefs = {chef1,chef2,chef3,chef4};

        restaurant1.chefs.addAll(Arrays.asList(chefs));




    }
}
/*
4.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

 */
