import java.util.Scanner;

public class Multiplication_Tables {
    // Find the Multiplication Tables
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Tables: ");
        int t=in.nextInt();
        System.out.println("Enter the limit:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(+i+"*"+t+"="+i*t);
        }
    }
}
