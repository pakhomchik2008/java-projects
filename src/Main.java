import java.util.Scanner;



public class Main {
    public static void main(String[] args)
    {
        Transport bmw = new Transport();
        bmw.setValues(250.5f,2500,"white",new byte[]{0,0,0});
        String r = bmw.getValues();
        System.out.println(r);

        //bmw.speed = 250.5f;
        //bmw.weight = 2500;
        //bmw.color = "white";
        //bmw.coordinate = new byte[]{0,0,0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        bmw.color = "red";
        bmw.coordinate = new byte[]{100,0,0};

        String r2 = truck.getValues();
        System.out.println(r2);

        System.out.println("truck speed " + truck.speed + ".BMW speed"+ bmw.speed);
    }
}
