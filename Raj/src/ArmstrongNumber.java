import java.util.Scanner;

public class ArmstrongNumber {
    // Find ArmstrongNumber
    public static void main(String args[])
    {

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 3 digit number:");
        int number=in.nextInt();
        /*int count=0;
        for(int i=0;i<number;i++){
            number=number/10;
             count++;
        } */
        int d1,d2,d3;
        int tem=number;

        d1=tem%10;
        tem=tem/10;

        d2=tem%10;
        tem=tem/10;

        d3=tem%10;
        int Result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(number==Result)
        {
            System.out.println("Number: "+number+" is ArmstrongNumber");
        }
        else
        {
            System.out.println("This is not a armstrongNumber");
        }
    }

}
