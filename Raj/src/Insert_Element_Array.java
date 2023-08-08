import java.util.Arrays;

public class Insert_Element_Array {
    // insert the element in an array
    public static void main(String args[])
    {
     int[]a={10,20,30,40,50,60,70,80,90,100};

     int indux=2;
     int value=55;
     System.out.println("Before Insert: "+Arrays.toString(a));
     for(int i=a.length-1;i>indux;i--)
     {
         a[i]=a[i-1];
     }
     a[indux]=value;
     System.out.println("After Insert: "+Arrays.toString(a));
    }
}
