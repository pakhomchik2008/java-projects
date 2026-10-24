import java.util.Scanner;



public class Main {
    public static void main(String[] args)
    {
        int[][] matrix = new int[5][5];
    Scanner sc = Scanner(System.in);
    for (int i = 0;i<matrix.length;i++)
    {
        for(int j = 0;j<matrix[i].length;j++)
        {
            int num = sc.nextInt();
            matrix[i][j]+=num;
            System.out.print(matrix[i][j]+" ");
        }
    }

    
    int even = 0;
    for(int i = 0 ;i<matrix.length;i++)
    {
        for(int j = 0;j<matrix[i].length;j++)
        {
            if (matrix[i][j]%2==0)
            {
                System.out.print("this el " + matrix[i][j] + " is even");
            }
        }
    }
    }
    





}
