import java.util.Scanner;

public class Strong_Number {
    //Find the Strong number
    public static void main(String args[])
    {
        int num,rem,originalnum,fact,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number:");
        num=in.nextInt();
        originalnum=num;

        while(num>0)
        {
           rem=num%10;
            fact=1;
           for(int i=1;i<=rem;i++)
           {

            fact*=i;
          }
            sum+=fact;
           num=num/10;

        }

        if(sum==originalnum)
        {
            System.out.println(+originalnum+" is Strong Number");
        }
        else {
            System.out.println(+originalnum+" is not a Strong Number");
        }

    }
}

