public class Actor {
    String name;
    int age;
    String country;
    int filmsCount;

    Actor(String name,int age,String country,int filmsCount){
        this.name = name;
        this.age = age;
        this.country = country;
        this.filmsCount = filmsCount;
    }

    void showInfo(){
        System.out.println(name + " "+ age + " " + country+" "+filmsCount);
    }
}
