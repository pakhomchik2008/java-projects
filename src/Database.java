import java.util.Arrays;
import java.util.Comparator;


public class Database {
    Movie[] data = new Movie[100];
    int idx = 0;

    Database(){
        for(int i = 0;i<data.length;i++){
            data[i] = new Movie();
        }
    }

    void addMovie(Movie m){
        data[idx] = m;
        idx++;
    }

    void showAllMovie(){
        
        for(int i = 0;i<idx;i++)
        {
            Movie m = data[i];
            if(m.visible) m.showInfo();

            
        }

    }

    void editMovie(int idx, Movie m){
        data[idx] = m;
    }

    void deletMovie(int idx){
        data[idx].visible = false;
    }

    void sortMovies(Comparator<Movie> comp){
        Arrays.sort(data,comp);

    }


}
