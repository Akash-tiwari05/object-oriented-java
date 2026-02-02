package OOPs.polymorphism;

public class NextMain {

    public static void main(String[] args) {

        Movies movies = Movies.getMovies("A ","Akash");
        movies.watchMovies();

        /// Casting the movie object so it return only Adventure movies
        /*Adventure jaws = (Adventure) Movies.getMovies("A","Jaws");
        jaws.watchMovies();

        Object comedy = Movies.getMovies("C","Airplane");
        Comedy comedyMovies = (Comedy) comedy;
        comedyMovies.watchMovies();
        comedyMovies.watchComedy();


        var airplane = Movies.getMovies("C","Airplane");
        airplane.watchMovies();
        var comedyAir = (Comedy) airplane;
        comedyAir.watchComedy();*/

        Object unkownObject = Movies.getMovies("C","Air");
        if(unkownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c= (Comedy) unkownObject;
            System.out.println("Com......");
            c.watchComedy();
            c.watchMovies();
        }else if(unkownObject instanceof Adventure){
            System.out.println("Adv......");
             ((Adventure) unkownObject).watchAdventure();
        } else if (unkownObject instanceof ScienceFiction sify) {
            System.out.println("Sifi......");
            sify.watchMovies();
        }
        else {
            ((Movies)unkownObject).watchMovies();
        }
    }
}
