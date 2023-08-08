public class Armstrong_Numbers {
    // Find the  ArmstrongNumbers between 100 t0 999
    public static void main(String args[])
    {
        int d1,d2,d3,tem,Result;
        for(int Num=100;Num<=999;Num++)
        {
          tem=Num;

          d1=tem%10;
          tem=tem/10;

          d2=tem%10;
          tem=tem/10;

          d3=tem%10;

          Result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
          if(Num==Result)
          {
              System.out.println(+Num+" is ArmstrongNumber");
          }

        }
    }
}
