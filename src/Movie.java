public class Movie {
    String title;
    int year;
    double rating;
    boolean visible = true;


    Movie(String title,int year,double rating){
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    Movie(){
        title = "none";
        year = 0;
        rating = 0.0;

    }
    void showInfo(){
        System.out.println(title+ " "+year + " "+rating);
    }

    

}
