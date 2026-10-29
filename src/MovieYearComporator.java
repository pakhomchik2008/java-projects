import java.util.Comparator;

public class MovieYearComporator implements Comparator <Movie>{
    @Override
    public int compare(Movie m1,Movie m2){
        return Integer.compare(m2.year, m1.year);
    }
}