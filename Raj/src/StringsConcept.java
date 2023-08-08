import java.net.StandardSocketOptions;
/*
Immutable:
-> When we create a string it will be stored in string pool memory.
-> It cannot be change. thats why string is immutable.
    1) By string literal : Java String literal is created by using double quotes.
        For Example: String s=“Welcome”;
    2) By new keyword : Java String is created by using a keyword “new”.
        For example: String s=new String(“Welcome”);
    3) StringBuffer buffer=new StringBuffer("Yazhini");

    Custom String:
    -> Make class as final
    -> Make variable as private
    -> Make variable as final
    -> No setter method
    -> Make Deep copy for object
    Benefits:
    -> Saving Heap space
    -> Good for HashMap key
    -> Good for critical operation
    -> Good for multiple thread operation and Thread safe.


 */
public class StringsConcept {
    // String in java
    public static void main(String args[])
    {
        String a="Raj Saranya";
        String b="Raj Saranya";
        String d1=new String("Raj Saranya");
        StringBuilder d2=new StringBuilder("Raj Saranya");
        String c="Rishi Yazhini";
        System.out.println("A :"+a);
        System.out.println("B :"+b);
        System.out.println("C :"+c);
        System.out.println("A HashCode :"+a.hashCode());
        System.out.println("B HashCode :"+b.hashCode());
        System.out.println("C HashCode :"+c.hashCode());
        System.out.println("d1 HashCode :"+d1.hashCode());
        System.out.println("d2 HashCode :"+d2.hashCode());
        System.out.println("Equals :"+a.equals(b));
        System.out.println("Equals Ignore Case:"+a.equalsIgnoreCase(b));
        System.out.println("Length :"+a.length());
        System.out.println("CharAt :"+a.charAt(0));
        System.out.println("Uppercase :"+a.toUpperCase());
        System.out.println("Lowercase :"+a.toLowerCase());
        System.out.println("Replace :"+a.replace("Saranya","Amulbaby"));
        System.out.println("Contains :"+a.contains("Saranya"));
        System.out.println("Empty :"+a.isEmpty());
        System.out.println("Endwith :"+a.endsWith("ya"));
        System.out.println("Startwith :"+a.startsWith("Ra"));
        System.out.println("Substring :"+a.substring(5));
        System.out.println("Substring :"+a.substring(0,5));
        char[] carray=a.toCharArray();
        for(char d : carray){
            System.out.println(d+" ");
             }
        String d="  Rishi";
        System.out.println("Length :"+d.length());
        System.out.println("Trim :"+d.trim());
        System.out.println("Trim Length :"+d.trim().length());
    }
}
