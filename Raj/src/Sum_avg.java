import java.util.Scanner;

public class Sum_avg {
    public static void main(String args[])
    {
        //Find the sum and avg
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=in.nextInt();
        int sum=0, a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the value:"+i+":");
            a=in.nextInt();
            sum+=a;

        }
        System.out.println("Sum:"+sum);
        System.out.println("Avg:"+sum/n);
    }
}
