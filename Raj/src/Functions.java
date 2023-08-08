class Methods
{
    //no return and without args
    public void add() {
        int a = 123;
        int b = 10;
        System.out.println("Addition: " + (a + b));
    }
    //No return with args
    public void sub(int x, int y)
    {
        System.out.println("Subtraction: "+(x-y));
    }
    public int mul()
    {
        int a=123;
        int b=10;
        return a*b;
    }
    public float div(int x, int y)
    {
      return(x/y);
    }
    public int factorial(int n)
    {
        //Recursion Function
        if(n==1)
            return 1;
        else
            return(n*factorial(n-1));
    }

}

public class Functions {
    public static void main(String args[])
    {
        Methods o=new Methods();
        o.add();
        o.sub(123,10);
        System.out.println("Multiplication: "+o.mul());
        System.out.println("Division: "+o.div(123,10));
        System.out.println("Factorial:"+o.factorial(4));
            }
}
