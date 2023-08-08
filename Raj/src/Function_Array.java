import java.util.Arrays;
import java.util.Scanner;

public class Function_Array {
    public static int[] sendArray()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=in.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the Value : " + i + ":");
            a[i] = in.nextInt();
        }

        Arrays.sort(a);
        //returning array
         return a;

    }

    //Returning Array from Method
    public static void main(String args[]) 
    {
        int arr[]=sendArray();
        for(int a:arr)
            System.out.println(a);
    }
}
