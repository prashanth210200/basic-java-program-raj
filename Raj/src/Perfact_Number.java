import java.util.Scanner;

public class Perfact_Number {
    //Find the perfact numbers between 1-100.
    public static void main(String args[])
    {
        //Scanner in=new Scanner(System.in);
        //System.out.println("Enter the number: ");
        //int n=in.nextInt();

        int sum=0;
        for(int n=1;n<=100;n++) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    //sum = sum+i;
                    sum+=i;
                }
            }

            if (sum == n) {
                System.out.println(+n + " is Perfacct Number");
            } /*else {
                System.out.println(+n + " is not perfact number ");
            }*/
            sum=0;


        }

    }
}
