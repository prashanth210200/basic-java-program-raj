class Mathametical {
    public static int power(int base, int power)
    {
        int result=1;
        for(int i=1;i<=power;i++) {

        result*=base;
        }
            return result;
    }
}
public class StaticExample {
    public static void main(String args[])
    {

        System.out.println("Power:"+Mathametical.power(2,3));
    }
}
