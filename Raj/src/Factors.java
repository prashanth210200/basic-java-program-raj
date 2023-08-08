import java.util.Scanner;

public class Factors {
    //Find the factors
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Factor Number:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Result: "+i);
            }
        }
    }
}
