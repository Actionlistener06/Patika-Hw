import java.util.ArrayList;
import java.util.Arrays;

public class Movie extends Main {
    private String name;

    private String[] showtimes;

    ArrayList<Movie> movieList= new ArrayList<>();

    int movieCount=0;

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public Movie() {
    }

    public Movie(String name, String[] showtimes) {
        this.name = name;
        this.showtimes = showtimes;
    }

    public void addMovie(Movie movie){
        this.movieList.add(movie);
        movieCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(String[] showtimes) {
        this.showtimes = showtimes;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", showtimes=" + Arrays.toString(showtimes) +
                ", movieList=" + movieList +
                '}';
    }
}
