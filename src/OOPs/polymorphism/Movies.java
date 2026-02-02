package OOPs.polymorphism;

public class Movies {

    private String title;

    public Movies(String title) {
        this.title = title;
    }

    public static Movies getMovies(String type, String title){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movies(title);
        };
    }

    public void watchMovies(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }
}

class Adventure extends Movies{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("...%s%n".repeat(3),
                "Pleasant Scene ",
                "Scary Music",
                "SomeThing Bad Happen");
    }

    public void watchAdventure(){
        System.out.println("Watching a adventure movie..");
    }
}

class Comedy extends Movies{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("...%s%n".repeat(3),
                "SomeThing Funny Happen",
                "SomeThing even Funnier Happen",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy movie..");
    }
}

class ScienceFiction extends Movies{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovies() {
        super.watchMovies();
        System.out.printf("...%s%n".repeat(3),
                "Talking About Technologies",
                "Space Exploration",
                "Super Power");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction  movie..");
    }
}