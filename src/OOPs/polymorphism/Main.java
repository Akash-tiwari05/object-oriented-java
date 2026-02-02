package OOPs.polymorphism;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Movies movies = new Movies("Star War");
        movies.watchMovies();*/

        /*Movies theMovies = Movies.getMovies("Adventure","Star war");
        theMovies.watchMovies();*/

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter type ('A' for Adventure, 'C' for Comedy, " +
                    "'S' for Science Fiction or 'Q' for Quit )");
            String type = s.nextLine();

            if("Qq".contains(type)) break;
            System.out.println("Enter the movie title:");
            String title = s.nextLine();
            Movies movies = Movies.getMovies(type,title);
            movies.watchMovies();
        }
    }
}
