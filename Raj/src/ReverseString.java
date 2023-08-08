public class ReverseString {
    //Reverse string
    public static void main(String args[])
    {
        /*StringBuilder a=new StringBuilder("Raj is a goo11d and talented person");
        System.out.println(a);
        StringBuilder b=new StringBuilder();*/
        String a="Raj is a good person";
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)=='1') {
                continue;
            }
           System.out.print(a.charAt(i));
            // b.append(a.charAt(i));
        }
        //System.out.println(b);
    }
}
