import java.util.Scanner;

public class Prime {
    // Find the Prime Number
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=in.nextInt();
        int f=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                f++;
            }
        }
        if(f==2)
        {
            System.out.println(+n+" is prime number");

        }
        else
        {
            System.out.println(+n+" is not a prime number");
        }
    }
}
