import java.util.Scanner;



public class lesson19 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.width = sc.nextInt();
        rectangle.high = sc.nextInt();
        System.out.println("Area " + rectangle.Area());
    System.out.println("Perimetr " + rectangle.Perimetr());


        }




    static class Rectangle{
        int width = 0;
        int high = 0;
        
        int Area(){
            return width*high;
        }
        int Perimetr(){
            return (width+high)*2;
        }



    }

}
