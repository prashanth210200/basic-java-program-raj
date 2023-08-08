import java.util.Arrays;

public class ascending_order {
    // Find the ascending order
    public static void main(String args[])
    {
        int[]a=new int[] {10,8,5,37,29,64,5};
        System.out.println("before sort:"+ Arrays.toString(a));
        int tem;
        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    tem=a[i];
                    a[i]=a[j];
                    a[j]=tem;
                }
            }

        }
        System.out.println("After sort:"+Arrays.toString(a));
        System.out.println(Arrays.stream(a).findFirst());
        System.out.println(a[0]);

    }

}
