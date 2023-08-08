public class StringMethods {
    public void display( String name) {
       System.out.println("I am  String "+name);
    }
    public void display(Object obj) {
        System.out.println("I am object "+ obj);
    }

    public static void main(String args[]){
        StringMethods sm=new StringMethods();
              sm.display(null);


    }

}
