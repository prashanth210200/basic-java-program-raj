import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        //Find the factorial 5!=1*2*3*4*5=120
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Factorial Number: ");
        int n=in.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Result: "+f);
    }
}
