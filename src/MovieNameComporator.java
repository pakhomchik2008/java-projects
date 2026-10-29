import java.util.Comparator;

public class MovieNameComporator implements Comparator <Movie>{
    @Override
    public int compare(Movie m1, Movie m2){
        return m1.title.compareTo(m2.title);
    }
}
