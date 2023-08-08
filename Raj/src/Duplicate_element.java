public class Duplicate_element {
    //Find duplicate element
    public static void main(String args[])
    {
        int a[]={2,4,5,6,2,5,8,9,1,3,6};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+i;j<a.length;j++)
            {
               if((a[i]==a[j])&&(i!=j))
                {
                    System.out.println("Duplicate Element:"+a[j]);
                    //System.out.println(" Element:"+a[i]);
                }

                if((a[i]+a[j]==14)){
                    System.out.println(a[i]+":"+a[j]);

                }
            }

    }
    }
}
