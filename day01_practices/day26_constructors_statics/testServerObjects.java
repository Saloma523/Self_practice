package day26_constructors_statics;

import java.time.LocalDate;

public class testServerObjects {
    public static void main(String[] args) {

        Server server1 = new Server("salma",32,20,true, LocalDate.of(2023,4,4));
        System.out.println(server1);
    }
}





