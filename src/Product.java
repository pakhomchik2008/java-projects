public class Product {
    int id;
    String title;
    double price;

    Product(int id, String title, double price){
        this.id = id;
        this.title = title;
        this.price = price;
    }

    void showInfo(){
        System.out.println(id+" "+title+""+price);
    }
}
