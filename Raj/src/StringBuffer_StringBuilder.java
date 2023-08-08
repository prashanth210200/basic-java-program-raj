/*

both are stored in heap memory
	StringBuffer:
1)	StringBuffer is synchronized i.e.
thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
2)	StringBuffer is less efficient than StringBuilder.
3)	StringBuffer was introduced in Java 1.0

    StringBuilder:
1)  StringBuilder is non-synchronized i.e. not thread safe.
	It means two threads can call the methods of StringBuilder simultaneously.
2) 	StringBuilder is more efficient than StringBuffer.
3)  StringBuilder was introduced in Java 1.5
 */

public class StringBuffer_StringBuilder {
    public static void main(String args[])
    {
        StringBuffer buffer=new StringBuffer("Yazhini");
        System.out.println(buffer);
        buffer.append(" Kutty ");
        System.out.println(buffer);
        buffer.insert(14,"Ponnu");
        System.out.println(buffer);
        buffer.replace(9,11,"@@@");
        System.out.println(buffer);
        buffer.delete(9,11);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        buffer.setCharAt(0,'@');
        System.out.println(buffer);
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());// default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); //(oldcapacity*2)+2

    }
}
