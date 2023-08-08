public class Prime_numbers {
    //Find the Prime Numbers Between 1-999.
    public static void main(String args[])
    {
        int c=0;
        for(int n=1;n<=20;n++)
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(+n+" is prime Number");
            }
            c=0;
        }

    }
}
