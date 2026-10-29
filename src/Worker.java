public class Worker {
    String name;
    int age;
    double salary;
    
    Worker(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void showInfo(){
        System.out.println(name + " "+ " "+ age + " " + salary);
    }

}
