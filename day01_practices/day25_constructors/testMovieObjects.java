package day25_constructors;

import day13_returnMethods.title;

import java.time.LocalDate;
import java.util.Arrays;

public class testMovieObjects {
    /* 1. create an object of the movie:
    title: Java Developer: Zero to Hero
    country: USA
    Genre: Adventure, Comedy, Thriller
    release date: 04/18/2021
    director: Kuzzat Altay
    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

     */
    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Java Developer: Zero to Hero","Adventure, Comedy, Thriller", LocalDate.of(2021,04,18)," Kuzzat Altay");

        String[] list = {"Ozzy", "Ali","Muhtar","salma", "Ahmed","Edwered"};

        movie1.addCasts(list);
        movie1.addCast("Amina");

        System.out.println(movie1);


    }
}
/*
. Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

 */
