import java.util.Scanner;

public class getting_inputs {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 nos:");
        a = in.nextInt();
        b= in.nextInt();
        c=a*a+b*b+2*a*b;
        System.out.println("Results: "+c);

    }
}
