public class FibonacciRecursion {
     static int n1=-1,n2=1,n3;
    public static void fibonacci(int count) {
        if(count>0){
        n3=n1+n2;//-1+1=0,1+0=1,0+1=1,1+1=2,1+2=3
        System.out.println(n3);
        n1=n2;//1,0,1,1
        n2=n3;//0,1,1,2
        fibonacci(count-1);
    }
    }


    public static void main(String args[]) {
        fibonacci(15);

    }
}
