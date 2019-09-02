package creational.prototype;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational pattern in Java");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getTimeLength());
        System.out.println(movie.getPrice());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("GOF");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getTimeLength());
        System.out.println(anotherMovie.getPrice());
    }
}
